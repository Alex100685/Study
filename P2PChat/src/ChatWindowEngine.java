import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import javax.swing.JButton;


public class ChatWindowEngine implements ActionListener {
	
	Window parent;
	ChatWindowEngine(Window parent){
		this.parent = parent;
	}
	static ArrayList <IncomeSocket> socketList = new ArrayList<IncomeSocket>();

	public void actionPerformed(ActionEvent e) {
		
		
		Message m = new Message();
		
		JButton clickedButton = (JButton) e.getSource();
		if(clickedButton == parent.button){
			m.text = parent.outcomeMessageField.getText();
			m.isConnection = false;
			m.to = "";
			ClientThread.msg.add(m);
			Window.incomeMessageArea.setText(m.toString()+"\n"+Window.incomeMessageArea.getText());
			parent.outcomeMessageField.setText("");
			
		}
		if (clickedButton == parent.ipButton){
			Message.myIp = parent.ipField.getText();
			parent.ipButton.setEnabled(false);
			parent.friendsIpButton.setEnabled(true);
			
			
		}
		if (clickedButton == parent.friendsIpButton){
			IncomeSocket is = new IncomeSocket(parent.friendsIpTextfield.getText());
			is.start();
			socketList.add(is);
			m.isConnection = true;
			ClientThread.msg.add(m);
			parent.button.setEnabled(true);
	}

		
	
		
		
		
		
		
		
	
	
		
		
	}

}
