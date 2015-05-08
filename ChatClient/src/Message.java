import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;


import java.util.Date;


public class Message implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public Date date = new Date();
	public String from;
	public String to;
	public byte [] buf;
	public boolean isFile;
	public int fileLength;
	public String fileName;
	public boolean isPrivate;
	public transient String text;
	public transient String path;
	public int i;
	
	@Override
	public String toString(){
		return new StringBuilder()
		.append("[")
		.append(date.toString())
		.append(", From: ")
		.append(from)
		.append(", To: ")
		.append(to)
		.append("] ")
		.append(text)
		.toString();
	}
	
	public void writeToStream (OutputStream out) throws IOException{
		
		ByteArrayOutputStream bs = new ByteArrayOutputStream();
		ObjectOutputStream os = new ObjectOutputStream(bs);
		try{
			os.writeObject(this);
			if(!isFile){
				
				
				os.writeUTF(text);
			}else{
				
				os.writeUTF(path);
			}
			}
			finally{
				os.flush();
				os.close();
			}
		byte [] packet = bs.toByteArray();
		
		DataOutputStream ds = new DataOutputStream(out);
		ds.writeInt(packet.length);
		ds.write(packet);
		ds.flush();
		}
		
	public static Message readFromStream(InputStream in) throws IOException, ClassNotFoundException{
		if(in.available()<=0)
			return null;
		
		DataInputStream ds = new DataInputStream(in);
		int len = ds.readInt();
		byte[] packet = new byte[len];
		ds.read(packet);
		
		ByteArrayInputStream bs = new ByteArrayInputStream(packet);
		ObjectInputStream os = new ObjectInputStream(bs);
		
		try {
			Message msg = (Message) os.readObject();
			
			if (!msg.isFile){
				
				msg.text = (String) os.readUTF();
				
			}else {
			
				msg.path = (String) os.readUTF();
				
				
			}
			
			return msg;
		}
			finally{
				os.close();
			}
			
			
			
		}
		
}