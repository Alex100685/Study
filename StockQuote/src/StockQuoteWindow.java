import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;


public class StockQuoteWindow {

 JPanel window = new JPanel();
JPanel buttonspanel = new JPanel();
	JButton downloadquotesbutton = new JButton("Импортировать цены акций");
	 JButton savebutton = new JButton("Сохранить цены акций");
	 JButton loadbutton = new JButton("Загрузить с файла");
	 JLabel timeLabel = new JLabel();
	 JTextArea textArea = new JTextArea(20,50);
	 BorderLayout bl = new BorderLayout();
	 GridLayout gl = new GridLayout();
	
	StockQuoteWindow() {
		window.setLayout(bl);
		window.add(textArea);
		buttonspanel.add(downloadquotesbutton);
		buttonspanel.add(savebutton);
		buttonspanel.add(loadbutton);
		buttonspanel.setLayout(gl);
		window.add(buttonspanel, "South");
		window.add(timeLabel,"North");
		
		
		JFrame f = new JFrame ("Цены акций мировых компаний");
		f.setContentPane(window);
		f.pack();
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		StockQuoteEngine sqe = new StockQuoteEngine(this);
		downloadquotesbutton.addActionListener(sqe);
		savebutton.addActionListener(sqe);
		loadbutton.addActionListener(sqe);
			
		
		
		
	}
	
	public static void main (String [] args){
		
		
		
		StockQuoteWindow sqw = new StockQuoteWindow();
		StockQuoteEngine sqe = new StockQuoteEngine(sqw);
		Thread t = new Thread(sqe);
		t.start();
		
		
		
		
		
		
	}
	
	
	
}
