
import java.io.*;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

public class FileManager {
    private String path;

    private static ConcurrentHashMap<String, byte[]> map = new ConcurrentHashMap<String, byte[]>();
    
    private static long creationDate = 0;
    
    public FileManager(String path) {
        if (path.endsWith("/") || path.endsWith("\\"))
        	path = path.substring(0, path.length() - 1);
        
        this.path = path;
    }
    
    public byte[] get(String url) {
        try {
            if (map.containsKey(url) && ((new Date().getTime() - creationDate) < 600000 )) {
                return map.get(url);
            } else {
                String fullPath = path + url.replace('/', '\\');
                byte[] buf;

                RandomAccessFile f = new RandomAccessFile(fullPath, "r");
                try {
                    buf = new byte[(int)f.length()];
                    f.read(buf, 0, buf.length);
                   
                } finally {
                    f.close();
                }
                
                map.put(url, buf);
                creationDate = new Date().getTime();
                
                return buf;
            }
        } catch (IOException ex) {
            return null;
        }
    }
}
