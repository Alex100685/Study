package FileSystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class FileSystemEngine implements ActionListener {
	
	FileSystemWindow parent;
	FileSystemEngine(FileSystemWindow parent){
		this.parent = parent;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton clickedButton;
		clickedButton = (JButton) e.getSource();
		if (clickedButton==parent.button && parent.textArea.getText().endsWith("commands")){
			parent.textArea.setText("");
			parent.textArea.setText("from d:\\folder\\file1.txt to d:\\folder\\file2.txt copy - to copy file"+"\n"+"to d:\\folder\\file2.txt delete - to delete file2.txt"+"\n"+"to d:\\folder\\file2.txt create - to create file2.txt"+"\n"+"from d:\\folder\\file1.txt to d:\\folder\\file2.txt rename - to rename file1 to file 2"+"\n"+"to d:\\folder dir - to show the content of folder"+"\n"+
			"to d:\\folder1 to d:\\folder2 rename folder - to rename folder"+"\n"+"from d:\\folder1 to d:\\folder2 copy folder - to copy folder"+"\n"+
		"to d:\\file.txt create file - to create file"+"\n"+"to d:\\file.txt create folder - to create folder"+"\n"+"to d:\\file.txt delete file - to delete file"+"\n"+"to d:\\file.txt delete folder - to delete folder"+"\n"+"->");
	return;
		}
		if (clickedButton == parent.button && parent.textArea.getText().endsWith("create file")){
			String s = parent.textArea.getText();
			String [] sa = s.split(" ");
			FileFile ff = new FileFile(sa[sa.length-3]);
			ff.createFile();
			parent.textArea.setText("->");
			return;
		}
		if (clickedButton == parent.button && parent.textArea.getText().endsWith("create folder")){
			String s = parent.textArea.getText();
			String [] sa = s.split(" ");
			FileDirectory fd = new FileDirectory(sa[sa.length-3]);
			fd.createDirectory();
			parent.textArea.setText("->");
			return;
		}
		if (clickedButton == parent.button && parent.textArea.getText().endsWith("delete file")){
			String s = parent.textArea.getText();
			String [] sa = s.split(" ");
			FileFile ff = new FileFile(sa[sa.length-3]);
			ff.deleteFile();;
			parent.textArea.setText("->");
			return;
		}
		if (clickedButton == parent.button && parent.textArea.getText().endsWith("delete folder")){
			String s = parent.textArea.getText();
			String [] sa = s.split(" ");
			FileDirectory fd = new FileDirectory(sa[sa.length-3]);
			fd.deleteDirectory();
			parent.textArea.setText("->");
			return;
		}
		if (clickedButton == parent.button && parent.textArea.getText().endsWith("rename folder")){
			String s = parent.textArea.getText();
			String [] sa = s.split(" ");
			FileDirectory fd = new FileDirectory(sa[sa.length-5], sa[sa.length-3]);
			fd.renameDirectory();
			parent.textArea.setText("->");
			return;
		}
		if (clickedButton == parent.button && parent.textArea.getText().endsWith("copy folder")){
			String s = parent.textArea.getText();
			String [] sa = s.split(" ");
			FileDirectory fd = new FileDirectory(sa[sa.length-5], sa[sa.length-3]);
			fd.start();
			parent.textArea.setText("->");
			return;
		}
		
		if (clickedButton == parent.button && parent.textArea.getText().endsWith("rename")){
			String s = parent.textArea.getText();
			String [] sa = s.split(" ");
			FileFile ff = new FileFile(sa[sa.length-4], sa[sa.length-2]);
			ff.renameFile();
			parent.textArea.setText("->");
			return;
		}
		
		if (clickedButton == parent.button && parent.textArea.getText().endsWith("copy")){
			String s = parent.textArea.getText();
			String [] sa = s.split(" ");
			FileFile ff = new FileFile(sa[sa.length-4], sa[sa.length-2]);
			ff.start();
			parent.textArea.setText("->");
			return;
		}
		if (clickedButton == parent.button && parent.textArea.getText().endsWith("dir")){
			String s = parent.textArea.getText();
			String [] sa = s.split(" ");
			FileDirectory fd = new FileDirectory(sa[sa.length-2]);
			parent.textArea.setText(fd.dir());
			return;
		
		}
		else{
			
			parent.textArea.setText(parent.textArea.getText()+"\n"+"NO SUCH COMMAND"+"\n"+"->");
		}
		
		
	}

}
