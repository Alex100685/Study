import javax.swing.*;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;


public class OrderWindow {
	
	JPanel windowContent = new JPanel ();
	JFormattedTextField bicycleTypeField = new JFormattedTextField();
	JFormattedTextField quantetyField = new JFormattedTextField();
	JButton orderButton = new JButton("OK");
	GridLayout gl = new GridLayout();
	JLabel typeLable = new JLabel("Тип велосипеда");
	JLabel quantLable = new JLabel("Количество");
	
	OrderWindow(){
		windowContent.setLayout(gl);
		windowContent.add(typeLable);
		windowContent.add(bicycleTypeField );
		windowContent.add(quantLable);
		windowContent.add(quantetyField);
		windowContent.add(orderButton);
		JFrame frame = new JFrame ("Заказ велосипедов");
		frame.setContentPane(windowContent);
		frame.pack();
		frame.setVisible(true);
		
		BikeOrder bo = new BikeOrder (this);
			orderButton.addActionListener(bo);
			
			
		
			
		
		
	}
	

	public static void main(String[] args) {
		
		
		OrderWindow ov = new OrderWindow();

	}

}
