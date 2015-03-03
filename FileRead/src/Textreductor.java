import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;



public class Textreductor {
	
	JPanel textReductorWindow = new JPanel();
	JPanel buttonPanel = new JPanel();
	JTextArea textArea = new JTextArea(20,50);
	JButton saveButton = new JButton("«берегти");
	JButton loadButton = new JButton("«авантажити");
	JButton firtreeButton = new JButton ("ялинка");
	GridLayout gl = new GridLayout();
	BorderLayout bl = new BorderLayout();
	
	
	Textreductor(){
		textReductorWindow.setLayout(bl);
		buttonPanel.setLayout(gl);
		buttonPanel.add(saveButton);
		buttonPanel.add(loadButton);
		buttonPanel.add(firtreeButton);
		textReductorWindow.add(textArea);
		textReductorWindow.add(buttonPanel, "South");
		
		JFrame f = new JFrame();
		f.setContentPane(textReductorWindow);
		f.pack();
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		TextReductorEngine te = new TextReductorEngine(this);
		saveButton.addActionListener(te);
		loadButton.addActionListener(te);
		firtreeButton.addActionListener(te);
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Textreductor tr = new Textreductor();
	}











}
