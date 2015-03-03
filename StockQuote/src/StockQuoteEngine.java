import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class StockQuoteEngine implements ActionListener, Runnable {	
	StockQuoteWindow parent;	
	StockQuoteEngine(StockQuoteWindow parent) {
		this.parent = parent;
	}
	
	public String setDate() throws InterruptedException{
		String date;
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss");
		date = sdf.format(d);
		return date;	
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		JButton clickedbutton;
		clickedbutton = (JButton) e.getSource();
		int size = 20;
		String [] scv = new String [size];
		scv[0] = "AAPL";
		scv[1] = "BAC";
		scv[2] = "YHOO";
		scv[3] = "MSFT";
		scv[4] = "PBR";
		scv[5] = "FB";
		scv[6] = "GE";
		scv[7] = "VALE";
		scv[8] = "T";
		scv[9] = "QQQ";
		scv[10] = "INTC";
		scv[11] = "CSCO";
		scv[12] = "FB";
		scv[13] = "KO";
		scv[14] = "AMZN";
		String data;
	URL url = null;
	URLConnection urlConn = null;
	InputStreamReader inStream = null;
	BufferedReader buff = null;
	
	if(clickedbutton == parent.downloadquotesbutton){
		
		try{
			for (int i=0; scv[i]!=null; i++){
			url = new URL ("http://quote.yahoo.com/d/quotes.csv?s="+scv[i]+"&f=sl1d1t1c1ohgv&e=.csv");
			urlConn = url.openConnection();
			inStream = new InputStreamReader(urlConn.getInputStream());
			buff = new BufferedReader(inStream);
			data = buff.readLine();
			StringTokenizer tokenizer = new StringTokenizer(data,",");
			String ticker = tokenizer.nextToken();
			String price = tokenizer.nextToken();
			String tradeDate = tokenizer.nextToken();
			String tradeTime = tokenizer.nextToken();
			
			parent.textArea.setText(parent.textArea.getText()+"\n"+"Компания :"+ticker+" Цена :"+price+" $ Дата :"+tradeDate+" Время : "+tradeTime);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}}
			catch(MalformedURLException e1){
				JOptionPane.showConfirmDialog(null,"Проверте указанный URL"+e1.toString() );
		}
		catch(IOException e2){
			JOptionPane.showConfirmDialog(null,"Не удалось прочитать с интернета"+e2.toString());
		}
		finally{
			try{
				inStream.close();
				buff.close();
				
			}
		catch(Exception e3){
			JOptionPane.showConfirmDialog(null,"Не удалось закрыть поток с буфером"+e3.toString());
			
		}
		}
		
	}
	
	
	
	
	
	
	
	
		
	}

	@Override
	public void run() {
		
		while(true){
		try {
		Thread t = new Thread();
			parent.timeLabel.setText(setDate());
			t.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}	
	}

}
