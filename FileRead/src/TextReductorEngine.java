import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JOptionPane;



public class TextReductorEngine implements ActionListener {
	
	
 Textreductor parent;
 String data;

	TextReductorEngine(Textreductor parent){
		this.parent = parent;
		
	}
	public void actionPerformed(ActionEvent e) {
		
		File f = new File("reductor.txt");
		if (!f.exists()){
			try {
				f.createNewFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		JButton clickedButton = (JButton) e.getSource();
		
		if (clickedButton.equals(parent.saveButton)){
			PrintWriter pw;
			
			try {
				FileOutputStream fos = new FileOutputStream(f);
				OutputStreamWriter osw = new OutputStreamWriter(fos);
				
				pw = new PrintWriter (osw, true);
			
			
			String dataout = parent.textArea.getText();
			pw.println(dataout);
			
			
			
			} catch (IOException e1) {
				
				JOptionPane.showConfirmDialog(null,"Что-то с Вашим файлом!!!");
				
			}
			
				
		}
		if(clickedButton.equals(parent.loadButton)){
			
			try {
				FileReader in = new FileReader(f);
				BufferedReader in2 = new BufferedReader (in);
				
				try {
					
					data = "";
					while ((data = in2.readLine())!= null ){
						parent.textArea.setText(data);
					}
					
					
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}}
			if (clickedButton.equals(parent.firtreeButton)){
				
				
				
			String data1 = parent.textArea.getText();
			String mass [] = sortA (data1);
			String sm= "";
			String mass22 [][] = new String [mass.length][1];
			for (int i = 0; i<mass.length; i++){
				
				mass22 [i][0] = mass [i];
				String s = "";
				sm = s+mass22[i][0];
				parent.textArea.setText(parent.textArea.getText()+"\n"+mass22[i][0]+"\n");
				
			
				
			}	
			}	
		}
	String [] sortA (String a1){
	
		String[] a = a1.split("[ ]");
		String temp;
		for (int i=1; i<a.length; i++){
			for (int j=a.length-1; j>=i; j--){
				
		if  (a[j-1].length() > a[j].length()){
					temp=a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
					
				}
			
		}
		}return a;
		
		
		
		
	}
	
}
