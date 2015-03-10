package FileSystem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.text.Caret;
import javax.swing.text.JTextComponent;

public class FileSystemWindow {
	
	JFrame frame;
	JButton button;
	JTextArea textArea;
	
	FileSystemWindow(){
		frame = new JFrame("My virtual file system");
		frame.setSize(700, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout( new BorderLayout());
		textArea = new JTextArea(600,300);
		textArea.setBackground(Color.BLACK);
		textArea.setForeground(Color.WHITE);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(textArea);
		textArea.setText("Insert 'commands' to get all commands..."+"\n"+"->");
		Caret caret = textArea.getCaret();
		caret.setDot(textArea.getText().length());
		caret.setBlinkRate(500);
		button = new JButton("Execute");
		JPanel panelbutton = new JPanel(new FlowLayout());
		panelbutton.add(button);
		frame.add(panelbutton, BorderLayout.SOUTH);
		frame.add(panel);
		frame.setVisible(true);
		frame.setResizable(false);
		FileSystemEngine fse = new FileSystemEngine(this);
		button.addActionListener(fse);
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		
		FileSystemWindow fsw = new FileSystemWindow();
		

	}

}
