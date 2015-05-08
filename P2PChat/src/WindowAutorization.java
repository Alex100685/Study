import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class WindowAutorization {
	
	JButton okButton;
	JTextField loginField;
	
	WindowAutorization(){
		JFrame autFrame = new JFrame("Авторизация");
		loginField = new JTextField(10);
		JLabel label = new JLabel("Insert your login");
		okButton = new JButton("OK");
		autFrame.setLayout(new BorderLayout());
		autFrame.add(label, BorderLayout.NORTH);
		autFrame.add(loginField, BorderLayout.CENTER);
		autFrame.add(okButton, BorderLayout.SOUTH);
		autFrame.setSize(250, 100);
		autFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		autFrame.setLocationRelativeTo(null);
		autFrame.setVisible(true);
		autFrame.setResizable(false);
		WindowAutListener wal = new WindowAutListener(this);
		okButton.addActionListener(wal);
	}
	
	
	
	
	
	public static void main(String [] args){
		
		WindowAutorization wa = new WindowAutorization();
		
	}

}
