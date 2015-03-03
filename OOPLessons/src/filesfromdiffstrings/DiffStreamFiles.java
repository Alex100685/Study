package filesfromdiffstrings;

import java.io.RandomAccessFile;

public class DiffStreamFiles {

	public static void main(String[] args) {
		
		ThreadStreamFiles [] threads = new ThreadStreamFiles[3];
		String scr1 = "d:\\01 Madonna-Hung Up.mp3";
		String scr2 = "d:\\02 Madonna-Forbidden Love.mp3";
		String scr3 = "d:\\03 Madonna-Secret.mp3";
		String dest = "d:\\1.mp3";
	threads[0] = new ThreadStreamFiles(scr1, dest);
	threads[1] = new ThreadStreamFiles(scr2, dest);	
	threads[2] = new ThreadStreamFiles(scr3, dest);	
	for (ThreadStreamFiles t : threads){
		t.start();
	}
	

	}

}
