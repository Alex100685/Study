import javax.swing.*;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.BorderLayout;
public class Toe {

	JPanel toeWindow = new JPanel();
	JFormattedTextField textField = new JFormattedTextField("Хотите поиграть?");
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton buttonNG = new JButton("Играть");
	JPanel buttons = new JPanel();
	BorderLayout bl = new BorderLayout();
	GridLayout gl = new GridLayout(3,3);
	
	Toe(){
		toeWindow.setLayout(bl);
		buttons.setLayout(gl);
		buttons.add(button1);
		buttons.add(button2);
		buttons.add(button3);
		buttons.add(button4);
		buttons.add(button5);
		buttons.add(button6);
		buttons.add(button7);
		buttons.add(button8);
		buttons.add(button9);
		toeWindow.add(buttons,"Center");
		toeWindow.add(textField,"North");
		toeWindow.add(buttonNG,"South");
		JFrame frame = new JFrame();
		frame.setContentPane(toeWindow);
		frame.pack();
		frame.setVisible(true);
		
		button1.setEnabled(false);
		button2.setEnabled(false);
		button3.setEnabled(false);
		button4.setEnabled(false);
		button5.setEnabled(false);
		button6.setEnabled(false);
		button7.setEnabled(false);
		button8.setEnabled(false);
		button9.setEnabled(false);
		textField.setEnabled(false);
		Font textFieldFont = new Font("Monospased", Font.CENTER_BASELINE,15);
	textField.setFont(textFieldFont);
		
		ToeEngine toeengine = new ToeEngine(this);
		button1.addActionListener(toeengine);
		button2.addActionListener(toeengine);
		button3.addActionListener(toeengine);
		button4.addActionListener(toeengine);
		button5.addActionListener(toeengine);
		button6.addActionListener(toeengine);
		button7.addActionListener(toeengine);
		button8.addActionListener(toeengine);
		button9.addActionListener(toeengine);
		buttonNG.addActionListener(toeengine);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
	
	Toe toe=new Toe();
		

	}

}
