
import java.lang.Exception;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.lang.Thread;

public class Client extends Thread {
    private Socket socket;
    private List<Client> clients;
    private FileManager fm;
	public static boolean isFile =false;
    
    public Client(Socket socket, List<Client> clients, String path) {
        this.socket = socket;
        this.clients = clients;
        fm = new FileManager(path);
    }
    
    private void return400(OutputStream os) throws IOException {
        byte[] resp = "HTTP/1.1 400 Bad Request\r\n\r\n".getBytes();
        os.write(resp);
    }
    
    private byte[] getBinaryHeaders(List<String> headers) {
        StringBuilder res = new StringBuilder();

        for (String s : headers) 
            res.append(s);
            
        return res.toString().getBytes();
    }
    
    private void process(String request, OutputStream os, byte [] data) throws IOException {
    
    	
        System.out.println(request);
        String fileName = request;
        System.out.println("---------------------------------------------");
    	
        int idx = request.indexOf("\r\n");
        request = request.substring(0, idx);

        String[] parts = request.split(" ");
        if (parts.length != 3) {
            return400(os);
            return;
        }

        String req = parts[0], url = parts[1], http = parts[2];
        
        if (( ! http.equalsIgnoreCase("HTTP/1.0")) && ( ! http.equalsIgnoreCase("HTTP/1.1"))) {
            return400(os);
            return;
        }
        if ( ! req.equalsIgnoreCase("GET") && ! req.equalsIgnoreCase("POST")) {
            return400(os);
            return;
        }
        if ("GET".equalsIgnoreCase(req) &&  "/".equals(url)){
            url = "/index.html";
        
        List<String> headers = new ArrayList<String>();
        headers.add("HTTP/1.1 200 OK\r\n");
        
        byte[] content = fm.get(url);
        
        ProcessorsList pl = new ProcessorsList();
        pl.add(new Compressor(9));
        pl.add(new Chunker(30)); // comment
        content = pl.process(content, headers);
        
        if (content != null) {
        	
            headers.add("Connection: close\r\n\r\n");
            
            os.write(getBinaryHeaders(headers));
            os.write(content);
        }
        }
       if ("POST".equalsIgnoreCase(req) && "/".equals(url)){
          //  isFile = true;
           
        
        List<String> headersPost = new ArrayList<String>();
        
        
       ProcessorsList plPost = new ProcessorsList();
       
        int start = fileName.indexOf("filename");
        fileName = fileName.substring(start+10);
        for(int i=0; i<fileName.length(); i++){
        	if(fileName.charAt(i) == '\r'){
        		fileName = fileName.substring(0, i-5);
        	}
        }
        
        ByteArrayOutputStream zipByteOut = new ByteArrayOutputStream();
        ZipOutputStream zipOut = new ZipOutputStream(zipByteOut);
        ZipEntry entry1 = new ZipEntry(fileName);
        zipOut.putNextEntry(entry1);
        zipOut.write(data);
        zipOut.finish();
        zipOut.closeEntry();
        byte[] zippedFile = zipByteOut.toByteArray();
        
        
        if (data != null) {
        	headersPost.add("HTTP/1.1 200 OK\r\n");
            headersPost.add("Content-Transfer-Encoding:binary\r\n");
            headersPost.add("Content-Type:application/zip\r\n");
        	headersPost.add("Content-Disposition:attachment; filename=\"_"+fileName+".zip\"\r\n");
        	
        	ProcessorsList pl = new ProcessorsList();
            plPost.add(new Compressor(9));
            plPost.add(new Chunker(30)); // comment
            zippedFile = plPost.process(zippedFile, headersPost);
            
            
            headersPost.add("Connection: close\r\n\r\n");
            
            os.write(getBinaryHeaders(headersPost));
            os.write(zippedFile);
            
            
        }
       }
        
        
         else {
            byte[] resp = "HTTP/1.1 404 Not Found\r\n\r\n".getBytes();
            os.write(resp);
        }
    }

    @SuppressWarnings("unchecked")
	@Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();
            int r, offset = 0;
            byte[] buf = new byte[10240];

            do {
            	Thread.sleep(200);
                r = is.read(buf, offset, buf.length - offset);
                if (r > 0) {
                    offset += r;
                    
                    for (int i = 0; i < offset; i++) {
                        if (buf[i] == (byte)13) {
                            if ((i + 3 < offset) &&
                                (buf[i + 1] == (byte)10) &&
                                (buf[i + 2] == (byte)13) &&
                                (buf[i + 3] == (byte)10))
                            {
                           
                                String request = new String(buf, 0, offset - 4);
                                byte [] fileRequest = buf;
                                buf = new byte[10240];
                                offset = 0;
                                
                                if(request.startsWith("POST")){
                                	
									@SuppressWarnings("rawtypes")
									ArrayList  startList = new ArrayList();
                                	for(int i1=0; i1<fileRequest.length-4; i1++){
                                		if((fileRequest[i1] == 13) && (fileRequest[i1+1] == 10) && (fileRequest[i1+2] == 13) && (fileRequest[i1+3] == 10)){
                                			startList.add(i1);
                                		}
                                		
                                		if((fileRequest[i1] == 13) && (fileRequest[i1+1] == 10) && (fileRequest[i1+2] == 45) && (fileRequest[i1+3] == 45)){
                                			startList.add(i1);
                                		}
                                		
                                	}
                                	int count=0;
                                	int bufLength = (int)(startList.get(3)) - ((int) (startList.get(2))+4);
                                	buf = new byte [bufLength];
                                	for(int k=(int) startList.get(2)+4; k<(int) startList.get(3); k++){
                                		buf[count] = fileRequest[k];
                                		count++;
                                	}
                                	process(request, os, buf);
                                }
                                
                                process(request, os, buf);
                            }
                        }
                    }
                }
            } while ( ! isInterrupted());
            
            clients.remove(this);

        } catch (Exception ex) {
            return;
        }
    }
}