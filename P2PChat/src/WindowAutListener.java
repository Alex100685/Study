import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JOptionPane;


public class WindowAutListener implements ActionListener {
	
	WindowAutorization parent;
	WindowAutListener(WindowAutorization parent){
		this.parent = parent;
	}
	Message m;
	
	public void actionPerformed(ActionEvent e) {
		JButton clickedButton = (JButton) e.getSource();
		
		
		
		if (clickedButton == parent.okButton && (parent.loginField.getText().equals("") || parent.loginField.getText().equals(null))){
			
			JOptionPane.showMessageDialog(null,"PLEASE insert your login!");
		}
		else
		{
			
			m.from = parent.loginField.getText();
			Server server = new Server(5000);
			
			Window w = new Window();
			server.start();
		}
		
	}
	
	
	
}


