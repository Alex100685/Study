package FileSystem;

import java.awt.BorderLayout;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class CopyProgress extends Thread {
	
	String path;
	String path2;
	long lenout = 0;
	long lennewfile = 1;
	
	CopyProgress(String path, String path2){
		this.path = path;
		this.path2 = path2;	
	}
	
	public void run(){
		
			File in = new File(path);
			File out = new File(path2);
			lenout = in.length();
			JFrame frame = new JFrame("Process of copying");
			frame.setSize(200, 100);
			frame.setLocationRelativeTo(null);
			frame.setLayout(new BorderLayout());
			frame.setResizable(false);
			JProgressBar progress = new JProgressBar();
			progress.setStringPainted(true);
			progress.setMinimum(0);
			progress.setMaximum(100);
			JPanel panelprogress = new JPanel();
			panelprogress.add(progress);
			frame.add(panelprogress, BorderLayout.CENTER);
			frame.setVisible(true);
			while (lenout != lennewfile){
				lennewfile = out.length();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				progress.setValue((int) (lennewfile/((lenout)/100)));
			}	
		}		
	}
	


