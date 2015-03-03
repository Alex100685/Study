import java.util.Arrays;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
class Money {
	
	JPanel window = new JPanel();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JTextField textField1 = new JTextField(50);
	JLabel field1Label = new JLabel("¬ведите сумму гривен :");
	JTextField textField2 = new JTextField(200);
	JButton activeButton = new JButton("«аписать строками");
	GridLayout gl = new GridLayout(4,4,15,15);
	
	
	Money (){
		window.setLayout(gl);
		window.add(field1Label);
		window.add(textField1);
		window.add(textField2);
		window.add(activeButton);
		JFrame frame = new JFrame("ƒеньги");
		frame.setContentPane(window);
		frame.pack();
		frame.setSize(1000, 200);
		frame.setVisible(true);
		
		MoneyEngine mon = new MoneyEngine(this);
		
		
		activeButton.addActionListener(mon);
	}
	
	public static void main(String[] args) {
		Money mon = new Money();
	
	}
	
	
	public class MoneyEngine implements ActionListener {
		
		
	private Money parent;




	MoneyEngine (Money parent){
		this.parent = parent;
	}
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		
		
		
		String money = null;
		JButton clickedButton = (JButton) e.getSource();
		
		
		if (clickedButton == parent.activeButton){
			
			if (!parent.textField1.getText().equals("") && parent.textField2.getText().equals("")){
				
			
			money = parent.textField1.getText();}
			
			if (parent.textField1.getText().equals("") && parent.textField2.getText().equals("")){
				
			
			parent.field1Label.setText("¬ведите сюда сумму :");}
			if (!parent.textField1.getText().equals("") && !parent.textField2.getText().equals("") ||
					parent.textField1.getText().equals("—Ћ»Ў ќћ ƒЋ»ЌЌќ≈ „»—Ћќ!!!")){
				
			
				parent.textField1.setText("");
				parent.textField2.setText("");
			
			return;
			}
			if (parent.textField1.getText().length() > 16 && parent.textField2.getText().equals("")){
				
				
				parent.textField1.setText("—Ћ»Ў ќћ ƒЋ»ЌЌќ≈ „»—Ћќ!!!");
				
				
				return;
				}
			
		String b1 = "миллиард ";
		String b2 = "миллиарда ";
		String b3 = "миллиардов ";
		String m1 = "миллион ";
		String m2 = "миллиона ";
		String m3 = "миллионов ";
		String t1 = "тыс€ча ";
		String t2 = "тыс€ч ";
		String t3 = "тыс€чи ";
		String h1 = "сто ";
		String h2 = "сти ";
		String h3 = "ста ";
		String h4 = "сот ";
		String one1 = "один ";
		String one2 = "одна ";
		String two1 = "два ";
		String two2 = "две ";
		String three1 = "три ";
		String four1 = "четыре ";
		String five1 = "п€ть ";
		String six1 = "шесть ";
		String seven1 = "семь ";
		String eight1 = "восемь ";
		String nine1 = "дев€ть ";
		String ten = "дес€ть ";
		String dec = "надцать ";
		String val1 = "гривен, ";
		String valcop1 = "копеек ";
		String val2 = "гривна, ";
		String val3 = "гривны, ";
		String valcop2 = "копейка ";
		String zero1 = "";
		String enty = "дцать ";
		String enty1 = "дес€т ";
		String nosto = "носто ";
		String coma = ",";
		String eleven = "одинадцать ";
		String tvelve = "двенадцать ";
		String thirteen = "тринадцать ";
		String fourteen = "четырнадцать ";
		String fifteen = "п€тнадцать ";
		String sixteen = "шестнадцать ";
		String seventeen = "семнадцать ";
		String eighteen = "восемнадцать ";
		String nineteen = "дев€тнадцать ";
		String twenty = "двадцать ";
		String thirty = "тридцать ";
		String fourty = "сорок ";
		String fifty = "п€тьдес€т ";
		String sixty = "шестьдес€т ";
		String seventy = "семдис€т ";
		String eighty = "восемьдес€т ";
		String ninety = "дев€носто ";
		String twohundred = "двести ";
		String threehundred = "триста ";
		String fourhundred = "четыреста ";
		String fivehundred = "пь€тсот ";
		String sixhundred = "шестсот ";
		String sevenhundred = "семьсот ";
		String eighthundred = "восемьсот ";
		String ninehundred = "дев€тсот ";
		String empty = "";
				
		
		
		
		String [] hundreds = {empty, h1, twohundred, threehundred, fourhundred, fivehundred, sixhundred, sevenhundred, eighthundred, ninehundred, empty};
		String [] tys = {empty, ten, twenty, thirty, fourty, fifty, sixty, seventy, eighty, ninety};
		String [] teens = {empty, eleven, tvelve, thirteen, fourteen, fifteen, sixteen, seventeen, eighteen, nineteen};
		String [] in = {zero1, one1, two1, three1, four1, five1, six1, seven1, eight1, nine1};
		
		
		
		//money
		if (!money.equals("")){

		
		char [] monVal = money.toCharArray();	
		int moneyNum [] = new int [monVal.length-1];
		
		
		for (int i=0; i<money.length()-3; i++){
			
		 moneyNum [i] = Character.getNumericValue(monVal [i]);
		 }
		
		for (int i=money.length()-2; i<money.length(); i++){
			
			 moneyNum [i-1] = Character.getNumericValue(monVal [i]);
		}
		
	    
	    
	 String [] moneyArray = new String [moneyNum.length];
	
	 for (int i=moneyArray.length-1; i>moneyArray.length-4; i=i-2){
	moneyArray [i] = in [moneyNum[i]];
	 }
	 
	 for (int i=moneyArray.length-6; i>=0; i=i-3){
			moneyArray [i] = in [moneyNum[i]];
			 }
	 
	 
	 for (int i=moneyArray.length-2; i>moneyArray.length-5; i=i-2){
			moneyArray [i] = tys [moneyNum[i]];
			if(tys[moneyNum[i]] =="дес€ть "){
				moneyArray [i+1] = teens[moneyNum[i+1]];
				moneyArray [i] = empty;
			}
			 }
	 
	 for (int i=moneyArray.length-7; i>=0; i=i-3){
			moneyArray [i] = tys [moneyNum[i]];
			if(tys[moneyNum[i]] =="дес€ть "){
				moneyArray [i+1] = teens[moneyNum[i+1]];
				moneyArray [i] = empty;
			}
			 }
	 
	 for (int i=moneyArray.length-5; i>=0; i=i-3){
			moneyArray [i] = hundreds [moneyNum[i]];
			 }
	 
	 String moneyArray2 [] = new String [12];
	 for (int i=0; i<moneyArray.length; i++){
		 
		 moneyArray2 [moneyArray2.length-1-i] = moneyArray[moneyArray.length-1-i];
		 
	 }
		
		
		String moneyArray3 [] = new String [17];
		moneyArray3 [16] = valcop1;
		moneyArray3 [15] = moneyArray2[moneyArray2.length-1];
		moneyArray3 [14] = moneyArray2[moneyArray2.length-2];
		moneyArray3 [13] = val1;
		moneyArray3 [12] = moneyArray2[moneyArray2.length-3];
		moneyArray3 [11] = moneyArray2[moneyArray2.length-4];
		moneyArray3 [10] = moneyArray2[moneyArray2.length-5];
		moneyArray3 [9] = t2;
		moneyArray3 [8] = moneyArray2[moneyArray2.length-6];
		moneyArray3 [7] = moneyArray2[moneyArray2.length-7];	
		moneyArray3 [6] = moneyArray2[moneyArray2.length-8];	
		moneyArray3 [5] = m3;	
		moneyArray3 [4] = moneyArray2[moneyArray2.length-9];	
		moneyArray3 [3] = moneyArray2[moneyArray2.length-10];	
		moneyArray3 [2] = moneyArray2[moneyArray2.length-11];	
		moneyArray3 [1] = b3;	
		moneyArray3 [0] = moneyArray2[moneyArray2.length-12];
		
		
		
		
		for (int i=0; i<11; i++){
			if (moneyArray3[i] == null){
				
				moneyArray3 [i] = "";
			}
		
		
		}
		
		if (moneyArray3[0] ==""){
			moneyArray3 [1]="";
				
		}
		if (moneyArray3[4] =="" && moneyArray3[3] =="" && moneyArray3[2] ==""){
			moneyArray3 [5]="";
				
		}
		if (moneyArray3[8] =="" && moneyArray3[7] =="" && moneyArray3[6] ==""){
			moneyArray3 [9]="";
				
		}
		if (moneyArray3[0] =="один "){
			moneyArray3 [1]="миллиард ";
				
		}
		if (moneyArray3[0] =="два "|| moneyArray3[0] =="три "|| moneyArray3[0] =="четыре "){
			moneyArray3 [1]="миллиарда ";
				
		}
		if (moneyArray3[4] =="один "){
			moneyArray3 [5]="миллион ";
				
		}
		if (moneyArray3[4] =="два "|| moneyArray3[4] =="три "|| moneyArray3[4] =="четыре "){
			moneyArray3 [5]="миллиона ";
				
		}
		if (moneyArray3[8] =="один "){
			moneyArray3 [9]="тыс€ча ";
				
		}
		if (moneyArray3[8] =="два "|| moneyArray3[8] =="три "|| moneyArray3[8] =="четыре "){
			moneyArray3 [9]="тыс€чи ";
		}
		if (moneyArray3[12] =="два "|| moneyArray3[12] =="три "|| moneyArray3[12] =="четыре "){
			moneyArray3 [13]="гривны, ";
		}
		if (moneyArray3[12] =="два "){
			moneyArray3 [12]="две ";
		}
		if (moneyArray3[12] =="один "){
			moneyArray3 [13]="гривна, ";
			moneyArray3 [12]="одна ";}
		
		
		
		if (moneyArray3[15] =="два "|| moneyArray3[15] =="три "|| moneyArray3[15] =="четыре "){
			moneyArray3 [16]="копейки ";}
		
		if (moneyArray3[15] =="один "){
			moneyArray3 [16]="копейка ";
		}
		if (moneyArray3[15] =="один "){
			moneyArray3 [15]="одна ";
		}
		
		
		
		
		
		StringBuilder s1 = new StringBuilder();
		for (int i=0;i<moneyArray3.length; i++){
		s1.append(moneyArray3[i]);
		
		}
		
	
		parent.textField2.setText(s1.toString());
		
	
		
		
		
		
		}
		
			
		}






	

		
	}
		
		

	}}


