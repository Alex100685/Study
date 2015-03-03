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
	JLabel field1Label = new JLabel("������� ����� ������ :");
	JTextField textField2 = new JTextField(200);
	JButton activeButton = new JButton("�������� ��������");
	GridLayout gl = new GridLayout(4,4,15,15);
	
	
	Money (){
		window.setLayout(gl);
		window.add(field1Label);
		window.add(textField1);
		window.add(textField2);
		window.add(activeButton);
		JFrame frame = new JFrame("������");
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
				
			
			parent.field1Label.setText("������� ���� ����� :");}
			if (!parent.textField1.getText().equals("") && !parent.textField2.getText().equals("") ||
					parent.textField1.getText().equals("������� ������� �����!!!")){
				
			
				parent.textField1.setText("");
				parent.textField2.setText("");
			
			return;
			}
			if (parent.textField1.getText().length() > 16 && parent.textField2.getText().equals("")){
				
				
				parent.textField1.setText("������� ������� �����!!!");
				
				
				return;
				}
			
		String b1 = "�������� ";
		String b2 = "��������� ";
		String b3 = "���������� ";
		String m1 = "������� ";
		String m2 = "�������� ";
		String m3 = "��������� ";
		String t1 = "������ ";
		String t2 = "����� ";
		String t3 = "������ ";
		String h1 = "��� ";
		String h2 = "��� ";
		String h3 = "��� ";
		String h4 = "��� ";
		String one1 = "���� ";
		String one2 = "���� ";
		String two1 = "��� ";
		String two2 = "��� ";
		String three1 = "��� ";
		String four1 = "������ ";
		String five1 = "���� ";
		String six1 = "����� ";
		String seven1 = "���� ";
		String eight1 = "������ ";
		String nine1 = "������ ";
		String ten = "������ ";
		String dec = "������� ";
		String val1 = "������, ";
		String valcop1 = "������ ";
		String val2 = "������, ";
		String val3 = "������, ";
		String valcop2 = "������� ";
		String zero1 = "";
		String enty = "����� ";
		String enty1 = "����� ";
		String nosto = "����� ";
		String coma = ",";
		String eleven = "���������� ";
		String tvelve = "���������� ";
		String thirteen = "���������� ";
		String fourteen = "������������ ";
		String fifteen = "���������� ";
		String sixteen = "����������� ";
		String seventeen = "���������� ";
		String eighteen = "������������ ";
		String nineteen = "������������ ";
		String twenty = "�������� ";
		String thirty = "�������� ";
		String fourty = "����� ";
		String fifty = "��������� ";
		String sixty = "���������� ";
		String seventy = "�������� ";
		String eighty = "����������� ";
		String ninety = "��������� ";
		String twohundred = "������ ";
		String threehundred = "������ ";
		String fourhundred = "��������� ";
		String fivehundred = "������� ";
		String sixhundred = "������� ";
		String sevenhundred = "������� ";
		String eighthundred = "��������� ";
		String ninehundred = "�������� ";
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
			if(tys[moneyNum[i]] =="������ "){
				moneyArray [i+1] = teens[moneyNum[i+1]];
				moneyArray [i] = empty;
			}
			 }
	 
	 for (int i=moneyArray.length-7; i>=0; i=i-3){
			moneyArray [i] = tys [moneyNum[i]];
			if(tys[moneyNum[i]] =="������ "){
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
		if (moneyArray3[0] =="���� "){
			moneyArray3 [1]="�������� ";
				
		}
		if (moneyArray3[0] =="��� "|| moneyArray3[0] =="��� "|| moneyArray3[0] =="������ "){
			moneyArray3 [1]="��������� ";
				
		}
		if (moneyArray3[4] =="���� "){
			moneyArray3 [5]="������� ";
				
		}
		if (moneyArray3[4] =="��� "|| moneyArray3[4] =="��� "|| moneyArray3[4] =="������ "){
			moneyArray3 [5]="�������� ";
				
		}
		if (moneyArray3[8] =="���� "){
			moneyArray3 [9]="������ ";
				
		}
		if (moneyArray3[8] =="��� "|| moneyArray3[8] =="��� "|| moneyArray3[8] =="������ "){
			moneyArray3 [9]="������ ";
		}
		if (moneyArray3[12] =="��� "|| moneyArray3[12] =="��� "|| moneyArray3[12] =="������ "){
			moneyArray3 [13]="������, ";
		}
		if (moneyArray3[12] =="��� "){
			moneyArray3 [12]="��� ";
		}
		if (moneyArray3[12] =="���� "){
			moneyArray3 [13]="������, ";
			moneyArray3 [12]="���� ";}
		
		
		
		if (moneyArray3[15] =="��� "|| moneyArray3[15] =="��� "|| moneyArray3[15] =="������ "){
			moneyArray3 [16]="������� ";}
		
		if (moneyArray3[15] =="���� "){
			moneyArray3 [16]="������� ";
		}
		if (moneyArray3[15] =="���� "){
			moneyArray3 [15]="���� ";
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


