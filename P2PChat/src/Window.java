

	

	import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
	import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.Caret;
import javax.swing.text.JTextComponent;


	public class Window {
		
		JFrame frame;
		static JButton button;
		public static JTextArea incomeMessageArea;
		public static JTextField outcomeMessageField;
		JTextField ipField;
		JButton ipButton;
		JLabel ipLabel;
		JLabel friendsIpLabel;
		JTextField friendsIpTextfield;
		JButton friendsIpButton;
		JLabel sendLabel;
		
		Window(){
			frame = new JFrame("Friends chat");
			frame.setSize(760, 400);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLocationRelativeTo(null);
			frame.setLayout( new BorderLayout());
			incomeMessageArea = new JTextArea(19,20);
			outcomeMessageField = new JTextField(54);
			ipLabel= new JLabel("Insert your IP");
			ipField = new JTextField(8);
			ipButton = new JButton("OK");
			incomeMessageArea.setBackground(Color.WHITE);
			incomeMessageArea.setForeground(Color.BLACK);
			JPanel areaPanel = new JPanel();
			JPanel fieldPanel = new JPanel();
			JPanel ipPanel = new JPanel();
			JPanel mainestPanel = new JPanel();
			mainestPanel.setLayout(new BorderLayout());
			areaPanel.setLayout(new BorderLayout());
			ipPanel.setLayout(new GridLayout(20, 1, 1, 1));
			friendsIpLabel = new JLabel("Insert your friend`s IP");
			friendsIpTextfield = new JTextField();
			friendsIpButton = new JButton("OK");
			sendLabel = new JLabel("Send private message to:");
			ipPanel.add(ipLabel);
			ipPanel.add(ipField);
			ipPanel.add(ipButton);
			ipPanel.add(friendsIpLabel);
			ipPanel.add(friendsIpTextfield);
			ipPanel.add(friendsIpButton);
			friendsIpButton.setEnabled(false);
			ipPanel.add(sendLabel);
			areaPanel.add(incomeMessageArea);
			fieldPanel.add(outcomeMessageField);
			Caret caret = incomeMessageArea.getCaret();
			caret.setDot(incomeMessageArea.getText().length());
			caret.setBlinkRate(500);
			button = new JButton("SEND");
			button.setEnabled(false);
			JPanel panelbutton = new JPanel(new FlowLayout());
			panelbutton.add(button);
			JPanel mainPanel = new JPanel(new BorderLayout());
			mainPanel.add(areaPanel, BorderLayout.NORTH);
			mainPanel.add(fieldPanel, BorderLayout.CENTER);
			mainPanel.add(panelbutton, BorderLayout.SOUTH);
			mainestPanel.add(mainPanel, BorderLayout.WEST);
			mainestPanel.add(ipPanel, BorderLayout.EAST);
			incomeMessageArea.setEditable(false);
			frame.add(mainestPanel);
			frame.setVisible(true);
			frame.setResizable(false);
			ChatWindowEngine cwe = new ChatWindowEngine(this);
			button.addActionListener(cwe);
			ipButton.addActionListener(cwe);
			friendsIpButton.addActionListener(cwe);
			
			
		}

	}

