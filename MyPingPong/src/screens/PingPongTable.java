package screens;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Point;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import engines.PingPongEngine;
import engines.PongConstants;

public class PingPongTable extends JPanel implements PongConstants {
	JLabel label;
	
	private int ComputerRacket_X = COMPUTER_RACKET_X;
	private int computerRacket_Y = COMPUTER_RACKET_Y_START;
	private int kidRacket_Y = KID_RACKET_Y_START;
	private int ballX = BALL_START_X;
	private int ballY = BALL_START_Y;
	
	
	
	
	static Dimension preferredSize = new Dimension(TABLE_WIDTH, TABLE_HEIGHT);
	
	public Dimension getPreferredSize (){
		return preferredSize;
		
	}
PingPongTable (){
		
		PingPongEngine engine = new PingPongEngine(this);
		//addMouseListener(engine); не нужен
		addMouseMotionListener(engine);
		addKeyListener(engine);
		
	}
	
	
	
	void addPanelToFrame(Container cont){
		
	
		cont.setLayout(new BoxLayout(cont,
				BoxLayout.Y_AXIS));
				cont.add(this);
				label = new JLabel("ўелк N - старт, S - серв, Q - выйти");
				cont.add(label);
	}
	
	public void paintComponent(Graphics gr){
	
		super.paintComponent(gr);
		//стол
		gr.setColor(Color.GRAY);
		gr.fillRect(0, 0, TABLE_WIDTH, TABLE_HEIGHT);
		//ракетка игрока
		gr.setColor(Color.blue);
		gr.fillRect(KID_RACKET_X_START, kidRacket_Y, RACKET_WIDTH, RACKET_LENGTH);
		//ракетка компьютера
		gr.setColor(Color.black);
		
		gr.fillRect(ComputerRacket_X,computerRacket_Y, RACKET_WIDTH, RACKET_LENGTH);
		//м€чик
		gr.setColor(Color.orange);
		gr.fillOval(ballX,ballY, 10, 10);
		//разделительные линии
		gr.setColor(Color.white);
		gr.drawRect(10, 10, 300, 200);
		gr.drawLine(160, 10, 160, 210);
		
	
	}
	
	
	public void setPlayerRacket(int yCoordinate){
		this.kidRacket_Y = yCoordinate;
		repaint();
		
	}
	 public int getPlayerRacket(int xCoordinate){
		
		return kidRacket_Y;
	}
	
	 public void setComputerRacket_Y(int yCoordinate){
		 computerRacket_Y = yCoordinate;
		 repaint();
		 }
	 public void setMessageText(String text){
		 label.setText(text);
		 repaint();
		 }
	 public void setBallPosition(int xPos, int yPos){
		 ballX=xPos;
		 ballY=yPos;
		 repaint();
		 }
	
	
	
	
	
	

	public static void main(String[] args) {
		
JFrame f = new JFrame("»гра дл€ четких пацыков");
f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
PingPongTable table = new PingPongTable();
		
		PingPongEngine eng = new PingPongEngine(table);
		table.addPanelToFrame(f.getContentPane());
		
		
		f.pack();
		f.setBounds(0,0,TABLE_WIDTH+5, TABLE_HEIGHT+40);
		f.addKeyListener(eng);
		f.setVisible(true);
		
		
	

	}

}
