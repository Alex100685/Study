import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

import javax.swing.JButton;
public class ToeEngine<squares> implements ActionListener {
	
	Toe parent;
	ToeEngine(Toe parent){
	this.parent=parent;}
	
Random r = new Random();
	
	public void actionPerformed(ActionEvent e) {
	
		JButton clickedbutton = (JButton) e.getSource();
		
		
		
		
			
			if(clickedbutton.equals(parent.buttonNG)){
				parent.button1.setEnabled(true);
				parent.button1.setText("");
				parent.button2.setEnabled(true);
				parent.button2.setText("");
				parent.button3.setEnabled(true);
				parent.button3.setText("");
				parent.button4.setEnabled(true);
				parent.button4.setText("");
				parent.button5.setEnabled(true);
				parent.button5.setText("");
				parent.button6.setEnabled(true);
				parent.button6.setText("");
				parent.button7.setEnabled(true);
				parent.button7.setText("");
				parent.button8.setEnabled(true);
				parent.button8.setText("");
				parent.button9.setEnabled(true);
				parent.button9.setText("");
				parent.textField.setText("Сделайте Ваш ход...");
				}
				
				if(clickedbutton.equals(parent.button1)){
					
					parent.button1.setText("X");
					parent.button1.setEnabled(false);
					if (parent.button2.getText() == parent.button3.getText() && parent.button3.getText() == "X" ||
							parent.button4.getText()==parent.button7.getText() && parent.button7.getText() == "X" ||
							parent.button5.getText() == parent.button9.getText() && parent.button9.getText() == "X"){
						parent.textField.setText("Вы победили!");
						return;
					}else if (!parent.button1.getText().equals("") && !parent.button2.getText().equals("")&&!parent.button3.getText().equals("")&&!parent.button4.getText().equals("")
							&& !parent.button5.getText().equals("") && !parent.button6.getText().equals("") && !parent.button7.getText().equals("")
							&& !parent.button8.getText().equals("") && !parent.button9.getText().equals("")){
						parent.textField.setText("Ничья!");
						
						return;
						
					}else{
						
					
					compMove();}}
				
				if(clickedbutton.equals(parent.button2)){
					
					parent.button2.setText("X");
					parent.button2.setEnabled(false);
					if (parent.button1.getText() == parent.button3.getText() && parent.button3.getText() == "X" ||
							parent.button5.getText()==parent.button8.getText() && parent.button8.getText() == "X"){
						parent.textField.setText("Вы победили!");
						return;
					}else if (!parent.button1.getText().equals("") && !parent.button2.getText().equals("")&&!parent.button3.getText().equals("")&&!parent.button4.getText().equals("")
							&& !parent.button5.getText().equals("") && !parent.button6.getText().equals("") && !parent.button7.getText().equals("")
							&& !parent.button8.getText().equals("") && !parent.button9.getText().equals("")){
						parent.textField.setText("Ничья!");
						
						return;
						
					}else{
						
						
						compMove();}}
					
					
				
				if(clickedbutton.equals(parent.button3)){
					
					parent.button3.setText("X");
					parent.button3.setEnabled(false);
					if (parent.button2.getText() == parent.button1.getText() && parent.button1.getText() == "X" ||
							parent.button5.getText()==parent.button7.getText() && parent.button7.getText() == "X" ||
							parent.button6.getText() == parent.button9.getText() && parent.button9.getText() == "X"){
						parent.textField.setText("Вы победили!");
						return;
					}else if (!parent.button1.getText().equals("") && !parent.button2.getText().equals("")&&!parent.button3.getText().equals("")&&!parent.button4.getText().equals("")
							&& !parent.button5.getText().equals("") && !parent.button6.getText().equals("") && !parent.button7.getText().equals("")
							&& !parent.button8.getText().equals("") && !parent.button9.getText().equals("")){
						parent.textField.setText("Ничья!");
						
						return;
					}else{
						
						
						compMove();}}
					
				
				if(clickedbutton.equals(parent.button4)){
					
					parent.button4.setText("X");
					parent.button4.setEnabled(false);
					if (parent.button1.getText() == parent.button7.getText() && parent.button7.getText() == "X" ||
							parent.button5.getText()==parent.button6.getText() && parent.button6.getText() == "X"){
						parent.textField.setText("Вы победили!");
						return;
						
					}else if (!parent.button1.getText().equals("") && !parent.button2.getText().equals("")&&!parent.button3.getText().equals("")&&!parent.button4.getText().equals("")
							&& !parent.button5.getText().equals("") && !parent.button6.getText().equals("") && !parent.button7.getText().equals("")
							&& !parent.button8.getText().equals("") && !parent.button9.getText().equals("")){
						parent.textField.setText("Ничья!");
						
						return;
						
					}else{
						
						
						compMove();}}
					
				
				
				if(clickedbutton.equals(parent.button5)){
				
					parent.button5.setText("X");
					parent.button5.setEnabled(false);
					if (parent.button2.getText() == parent.button8.getText() && parent.button8.getText() == "X" ||
							parent.button4.getText()==parent.button6.getText() && parent.button6.getText() == "X" ||
							parent.button1.getText() == parent.button9.getText() && parent.button9.getText() == "X" ||
							parent.button3.getText() == parent.button7.getText() && parent.button7.getText() == "X"){
						parent.textField.setText("Вы победили!");
						return;
					}else if (!parent.button1.getText().equals("") && !parent.button2.getText().equals("")&&!parent.button3.getText().equals("")&&!parent.button4.getText().equals("")
							&& !parent.button5.getText().equals("") && !parent.button6.getText().equals("") && !parent.button7.getText().equals("")
							&& !parent.button8.getText().equals("") && !parent.button9.getText().equals("")){
						parent.textField.setText("Ничья!");
						
						return;
					}else{
						
						
						compMove();}}
				
				
				if(clickedbutton.equals(parent.button6)){
					
					parent.button6.setText("X");
					parent.button6.setEnabled(false);
					if (parent.button3.getText() == parent.button9.getText() && parent.button9.getText() == "X" ||
							parent.button4.getText()==parent.button5.getText() && parent.button5.getText() == "X"){
						parent.textField.setText("Вы победили!");return;
					}else if (!parent.button1.getText().equals("") && !parent.button2.getText().equals("")&&!parent.button3.getText().equals("")&&!parent.button4.getText().equals("")
							&& !parent.button5.getText().equals("") && !parent.button6.getText().equals("") && !parent.button7.getText().equals("")
							&& !parent.button8.getText().equals("") && !parent.button9.getText().equals("")){
						parent.textField.setText("Ничья!");
						
						return;
						
					}else{
						
						
						compMove();}}
				
				if(clickedbutton.equals(parent.button7)){
					
					parent.button7.setText("X");
					parent.button7.setEnabled(false);
					if (parent.button8.getText() == parent.button9.getText() && parent.button9.getText() == "X" ||
							parent.button1.getText()==parent.button4.getText() && parent.button4.getText() == "X" ||
							parent.button5.getText() == parent.button3.getText() && parent.button3.getText() == "X"){
						parent.textField.setText("Вы победили!");return;
					}else if (!parent.button1.getText().equals("") && !parent.button2.getText().equals("")&&!parent.button3.getText().equals("")&&!parent.button4.getText().equals("")
							&& !parent.button5.getText().equals("") && !parent.button6.getText().equals("") && !parent.button7.getText().equals("")
							&& !parent.button8.getText().equals("") && !parent.button9.getText().equals("")){
						parent.textField.setText("Ничья!");
						
						return;
						
					}else{
						
						
						compMove();}}
					
				
				if(clickedbutton.equals(parent.button8)){
					
					parent.button8.setText("X");
					parent.button8.setEnabled(false);
					
					
					if (parent.button7.getText() == parent.button9.getText() && parent.button9.getText() == "X" ||
							parent.button5.getText()==parent.button2.getText() && parent.button2.getText() == "X"){
						parent.textField.setText("Вы победили!");return;
					}else if (!parent.button1.getText().equals("") && !parent.button2.getText().equals("")&&!parent.button3.getText().equals("")&&!parent.button4.getText().equals("")
							&& !parent.button5.getText().equals("") && !parent.button6.getText().equals("") && !parent.button7.getText().equals("")
							&& !parent.button8.getText().equals("") && !parent.button9.getText().equals("")){
						parent.textField.setText("Ничья!");
						
						return;
						
					}else{
						
						
						compMove();}}
				
				
				if(clickedbutton.equals(parent.button9)){
					
					parent.button9.setText("X");
					parent.button9.setEnabled(false);
				
					if (parent.button5.getText() == parent.button1.getText() && parent.button1.getText() == "X" ||
							parent.button7.getText()==parent.button8.getText() && parent.button7.getText() == "X" ||
							parent.button3.getText() == parent.button6.getText() && parent.button6.getText() == "X"){
						parent.textField.setText("Вы победили!");
						return;
					}else if (!parent.button1.getText().equals("") && !parent.button2.getText().equals("")&&!parent.button3.getText().equals("")&&!parent.button4.getText().equals("")
							&& !parent.button5.getText().equals("") && !parent.button6.getText().equals("") && !parent.button7.getText().equals("")
							&& !parent.button8.getText().equals("") && !parent.button9.getText().equals("")){
						parent.textField.setText("Ничья!");
						
						return;
						
					}else{
						
						
						compMove();}}
				
				
				
				
				
					
					
					
					
					
				}
				
				
	public void compMove(){
	
		
	// Первое нажатие	
		JButton squares [] = new JButton[9];
		squares [0] = parent.button1;
		squares [1] = parent.button2;
		squares [2] = parent.button3;
		squares [3] = parent.button4;
		squares [4] = parent.button5;
		squares [5] = parent.button6;
		squares [6] = parent.button7;
		squares [7] = parent.button8;
		squares [8] = parent.button9;
		
		int n;
		n= goEmpty();
		
		
		
	
		if (parent.button5.getText().equals("")){
			parent.button5.setText("O");
			parent.button5.setEnabled(false);
			parent.textField.setText("Компьютер ходит в клетку №5. Ваш ход...");
			return;
			
		}
		
		
		//Воля к победе
		else if (parent.button1.getText()==parent.button2.getText() && parent.button2.getText() == "O" && parent.button3.getText().equals("")) {
			parent.button3.setText("O");
			parent.button3.setEnabled(false);
			parent.textField.setText("Вы проиграли!");
			return;
			
			
			
		}
		else if (parent.button2.getText()==parent.button3.getText() && parent.button2.getText() == "O" && parent.button1.getText().equals("")){
			parent.button1.setText("O");
			parent.button1.setEnabled(false);
			parent.textField.setText("Вы проиграли!");
			return;
			
		}
		else if (parent.button1.getText()==parent.button3.getText() && parent.button3.getText() == "O" && parent.button2.getText().equals("")){
			parent.button2.setText("O");
			parent.button2.setEnabled(false);
			parent.textField.setText("Вы проиграли!");
			return;
		}
		else if (parent.button4.getText()==parent.button5.getText() && parent.button4.getText() == "O"&& parent.button6.getText().equals("")){
			parent.button6.setText("O");
			parent.button6.setEnabled(false);
			parent.textField.setText("Вы проиграли!");
			return;
					}
		else if (parent.button5.getText()==parent.button6.getText() && parent.button5.getText() == "O"&& parent.button4.getText().equals("")){
	
			parent.button4.setText("O");
			parent.button4.setEnabled(false);
			parent.textField.setText("Вы проиграли!");
			return;
			}	
		else if (parent.button4.getText()==parent.button6.getText() && parent.button4.getText() == "O"&& parent.button5.getText().equals("")){
		
			parent.button5.setText("O");
			parent.button5.setEnabled(false);
			parent.textField.setText("Вы проиграли!");
			return;
				}
		else if (parent.button7.getText()==parent.button8.getText() && parent.button7.getText() == "O"&& parent.button9.getText().equals("")){
	
			parent.button9.setText("O");
			parent.button9.setEnabled(false);
			parent.textField.setText("Вы проиграли!");
			return;
			}	
		else if (parent.button8.getText()==parent.button9.getText() && parent.button8.getText() == "O"&& parent.button7.getText().equals("")){
	
			parent.button7.setText("O");
			parent.button7.setEnabled(false);
			parent.textField.setText("Вы проиграли!");
			return;
			}	
		else if (parent.button7.getText()==parent.button9.getText() && parent.button7.getText() == "O"&& parent.button8.getText().equals("")){
	
			parent.button8.setText("O");
			parent.button8.setEnabled(false);
			parent.textField.setText("Вы проиграли!");
			return;
			}
		else if (parent.button1.getText()==parent.button4.getText() && parent.button4.getText() == "O"&& parent.button7.getText().equals("")){
		
			parent.button7.setText("O");
			parent.button7.setEnabled(false);
			parent.textField.setText("Вы проиграли!");
			return;
			}	
		else if (parent.button1.getText()==parent.button7.getText() && parent.button7.getText() == "O"&& parent.button4.getText().equals("")){
		
			parent.button4.setText("O");
			parent.button4.setEnabled(false);
			parent.textField.setText("Вы проиграли!");
			return;
			}	
		else if (parent.button4.getText()==parent.button7.getText() && parent.button7.getText() == "O"&& parent.button1.getText().equals("")){
		
			parent.button1.setText("O");
			parent.button1.setEnabled(false);
			parent.textField.setText("Вы проиграли!");
			return;
			}
		else if (parent.button2.getText()==parent.button5.getText() && parent.button5.getText() == "O"&& parent.button8.getText().equals("")){

			parent.button8.setText("O");
			parent.button8.setEnabled(false);
			parent.textField.setText("Вы проиграли!");
			return;
			}
		else if (parent.button5.getText()==parent.button8.getText() && parent.button8.getText() == "O"&& parent.button2.getText().equals("")){
		
			parent.button2.setText("O");
			parent.button2.setEnabled(false);
			parent.textField.setText("Вы проиграли!");	
			return;
		}
		else if (parent.button2.getText()==parent.button8.getText() && parent.button8.getText() == "O"&& parent.button5.getText().equals("")){
	
			parent.button5.setText("O");
			parent.button5.setEnabled(false);
			parent.textField.setText("Вы проиграли!");
			return;
			}
		else if (parent.button3.getText()==parent.button6.getText() && parent.button6.getText() == "O"&& parent.button9.getText().equals("")){
		
		
			
			parent.button9.setText("O");
			parent.button9.setEnabled(false);
			parent.textField.setText("Вы проиграли!");
			return;
			
		}	
		else if (parent.button6.getText()==parent.button9.getText() && parent.button9.getText() == "O"&& parent.button3.getText().equals("")){
		
			parent.button3.setText("O");
			parent.button3.setEnabled(false);
			parent.textField.setText("Вы проиграли!");
			return;
		}
		else if (parent.button3.getText()==parent.button9.getText() && parent.button9.getText() == "O"&& parent.button6.getText().equals("")){
			
			parent.button6.setText("O");
			parent.button6.setEnabled(false);
			parent.textField.setText("Вы проиграли!");
			return;
		}
		else if (parent.button1.getText()==parent.button5.getText() && parent.button5.getText() == "O"&& parent.button9.getText().equals("")){
		
			parent.button9.setText("O");
			parent.button9.setEnabled(false);
			parent.textField.setText("Вы проиграли!");
			return;
			
			}
		else if (parent.button5.getText()==parent.button9.getText() && parent.button9.getText() == "O"&& parent.button1.getText().equals("")){
			
			parent.button1.setText("O");
			parent.button1.setEnabled(false);
			parent.textField.setText("Вы проиграли!");
			return;
			}
		else if (parent.button1.getText()==parent.button9.getText() && parent.button9.getText() == "O"&& parent.button5.getText().equals("")){
		
			parent.button5.setText("O");
			parent.button5.setEnabled(false);
			parent.textField.setText("Вы проиграли!");
			return;
		}
		else if (parent.button3.getText()==parent.button5.getText() && parent.button5.getText() == "O"&& parent.button7.getText().equals("")){
		
			parent.button7.setText("O");
			parent.button7.setEnabled(false);
			parent.textField.setText("Вы проиграли!");
			return;
			}
		else if (parent.button5.getText()==parent.button7.getText() && parent.button7.getText() == "O"&& parent.button3.getText().equals("")){
		
			parent.button3.setText("O");
			parent.button3.setEnabled(false);
			parent.textField.setText("Вы проиграли!");
			return;
			}
		else if (parent.button3.getText()==parent.button7.getText() && parent.button7.getText() == "O"&& parent.button5.getText().equals("")){
			parent.button5.setText("O");
			parent.button5.setEnabled(false);
			parent.textField.setText("Вы проиграли!");
			return;}
			
			
		
	
		//Блок препятствия победе	
			
		else if (parent.button1.getText()==parent.button2.getText() && parent.button2.getText() == "X" && parent.button3.getText().equals("") ){

				parent.button3.setText("O");
				parent.button3.setEnabled(false);
				parent.textField.setText("Ход на №3");
				return;
				
				
			}
		else if (parent.button2.getText()==parent.button3.getText() && parent.button2.getText() == "X"&& parent.button1.getText().equals("") ){
				
				parent.button1.setText("O");
				parent.button1.setEnabled(false);
				parent.textField.setText("Ход на №1");
				return;
			}
		else if (parent.button1.getText()==parent.button3.getText() && parent.button3.getText() == "X"&& parent.button2.getText().equals("") ){
			
				parent.button2.setText("O");
				parent.button2.setEnabled(false);
				parent.textField.setText("Ход на №2");
			return;
			
			}		
		else if (parent.button4.getText()==parent.button5.getText() && parent.button4.getText() == "X"&& parent.button6.getText().equals("") ){
			
				parent.button6.setText("O");
				parent.button6.setEnabled(false);
				parent.textField.setText("Ход на №6");
			return;
			
			}			
		else if (parent.button5.getText()==parent.button6.getText() && parent.button5.getText() == "X"&& parent.button4.getText().equals("") ){
			
				parent.button4.setText("O");
				parent.button4.setEnabled(false);
				parent.textField.setText("Ход на №4");
				return;
			
			}			
		else if (parent.button4.getText()==parent.button6.getText() && parent.button4.getText() == "X"&& parent.button5.getText().equals("") ){
		
				parent.button5.setText("O");
				parent.button5.setEnabled(false);
				parent.textField.setText("Ход на №5");
				return;
				}
					
		else if (parent.button7.getText()==parent.button8.getText() && parent.button7.getText() == "X"&& parent.button9.getText().equals("") ){
				parent.button9.setText("O");
				parent.button9.setEnabled(false);
				parent.textField.setText("Ход на №9");
				return;
				
				
			}			
		else if (parent.button8.getText()==parent.button9.getText() && parent.button8.getText() == "X"&& parent.button7.getText().equals("") ){
			
				parent.button7.setText("O");
				parent.button7.setEnabled(false);
				parent.textField.setText("Ход на №7");
				return;
				
				
			}			
		else if (parent.button7.getText()==parent.button9.getText() && parent.button7.getText() == "X"&& parent.button8.getText().equals("") ){
			
				parent.button8.setText("O");
				parent.button8.setEnabled(false);
				parent.textField.setText("Ход на №8");
				return;
			
				
			}		
		else if (parent.button1.getText()==parent.button4.getText() && parent.button4.getText() == "X"&& parent.button7.getText().equals("") ){
			
				parent.button7.setText("O");
				parent.button7.setEnabled(false);
				parent.textField.setText("Ход на №7");
				return;
			
				
			}			
		else if (parent.button1.getText()==parent.button7.getText() && parent.button7.getText() == "X"&& parent.button4.getText().equals("") ){
				
				parent.button4.setText("O");
				parent.button4.setEnabled(false);
				parent.textField.setText("Ход на №4");
				return;
				
			}			
		else if (parent.button4.getText()==parent.button7.getText() && parent.button7.getText() == "X"&& parent.button1.getText().equals("") ){
			
				parent.button1.setText("O");
				parent.button1.setEnabled(false);
				parent.textField.setText("Ход на №1");
				return;
			
			}	
		else if (parent.button2.getText()==parent.button5.getText() && parent.button5.getText() == "X"&& parent.button8.getText().equals("") ){
				
				parent.button8.setText("O");
				parent.button8.setEnabled(false);
				parent.textField.setText("Ход на №8");
				return;
				
			}	
		else if (parent.button5.getText()==parent.button8.getText() && parent.button8.getText() == "X"&& parent.button2.getText().equals("") ){
				
				parent.button2.setText("O");
				parent.button2.setEnabled(false);
				parent.textField.setText("Ход на №2");
				return;
				
			}	
		else if (parent.button2.getText()==parent.button8.getText() && parent.button8.getText() == "X"&& parent.button5.getText().equals("") ){
				
				parent.button5.setText("O");
				parent.button5.setEnabled(false);
				parent.textField.setText("Ход на №5");
				return;
				
			}	
		else if (parent.button3.getText()==parent.button6.getText() && parent.button6.getText() == "X"&& parent.button9.getText().equals("") ){
			
				parent.button9.setText("O");
				parent.button9.setEnabled(false);
				parent.textField.setText("Ход на №9");
				return;
			
				
			}	
		else if (parent.button6.getText()==parent.button9.getText() && parent.button9.getText() == "X"&& parent.button3.getText().equals("") ){
				
				parent.button3.setText("O");
				parent.button3.setEnabled(false);
				parent.textField.setText("Ход на №3");
				return;
				}
		else if (parent.button3.getText()==parent.button9.getText() && parent.button9.getText() == "X"&& parent.button6.getText().equals("") ){
				
				parent.button6.setText("O");
				parent.button6.setEnabled(false);
				parent.textField.setText("Ход на №6");
				return;
				
			}	
		else if (parent.button1.getText()==parent.button5.getText() && parent.button5.getText() == "X"&& parent.button9.getText().equals("") ){
		
				parent.button9.setText("O");
				parent.button9.setEnabled(false);
				parent.textField.setText("Ход на №9");
				return;
				
			}	
		else if (parent.button5.getText()==parent.button9.getText() && parent.button9.getText() == "X"&& parent.button1.getText().equals("") ){
				
				parent.button1.setText("O");
				parent.button1.setEnabled(false);
				parent.textField.setText("Ход на №1");
				return;
				
			}	
		else if (parent.button1.getText()==parent.button9.getText() && parent.button9.getText() == "X"&& parent.button5.getText().equals("") ){
		
				parent.button5.setText("O");
				parent.button5.setEnabled(false);
				parent.textField.setText("Ход на №5");
				return;
				
			}	
		else if (parent.button3.getText()==parent.button5.getText() && parent.button5.getText() == "X"&& parent.button7.getText().equals("") ){
				
				parent.button7.setText("O");
				parent.button7.setEnabled(false);
				parent.textField.setText("Ход на №7");
				return;
				
			}	
		else if (parent.button5.getText()==parent.button7.getText() && parent.button7.getText() == "X"&& parent.button3.getText().equals("") ){
				
				parent.button3.setText("O");
				parent.button3.setEnabled(false);
				parent.textField.setText("Ход на №3");
				return;
				
			}	
		else if (parent.button3.getText()==parent.button7.getText() && parent.button7.getText() == "X"&& parent.button5.getText().equals("") ){
				
				parent.button5.setText("O");
				parent.button5.setEnabled(false);
				parent.textField.setText("Ход на №5");
				return;
				
		}
		
		
		//Не препятствование
				
		else if (parent.button1.getText()==parent.button2.getText() && parent.button2.getText() == "X" && !parent.button3.getText().equals("") ){
				
					squares[n].setText("O");
					squares[n].setEnabled(false);
					parent.textField.setText("Случайный ход на № "+(n+1));
					return;
				}
	
		else if (parent.button2.getText()==parent.button3.getText() && parent.button2.getText() == "X"&& !parent.button1.getText().equals("") ){
			
			squares[n].setText("O");
			squares[n].setEnabled(false);
			parent.textField.setText("Случайный ход на № "+(n+1));
			return;
		}
	else if (parent.button1.getText()==parent.button3.getText() && parent.button3.getText() == "X"&& !parent.button2.getText().equals("") ){
		
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
		
		}		
	else if (parent.button4.getText()==parent.button5.getText() && parent.button4.getText() == "X"&& !parent.button6.getText().equals("") ){
		
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
		
		}			
	else if (parent.button5.getText()==parent.button6.getText() && parent.button5.getText() == "X"&& !parent.button4.getText().equals("") ){
		
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
		
		}			
	else if (parent.button4.getText()==parent.button6.getText() && parent.button4.getText() == "X"&& !parent.button5.getText().equals("") ){
	
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
			}
				
	else if (parent.button7.getText()==parent.button8.getText() && parent.button7.getText() == "X"&& !parent.button9.getText().equals("") ){
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
			
			
		}			
	else if (parent.button8.getText()==parent.button9.getText() && parent.button8.getText() == "X"&& !parent.button7.getText().equals("") ){
		
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
			
			
		}			
	else if (parent.button7.getText()==parent.button9.getText() && parent.button7.getText() == "X"&& !parent.button8.getText().equals("") ){
		
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
		
			
		}		
	else if (parent.button1.getText()==parent.button4.getText() && parent.button4.getText() == "X"&& !parent.button7.getText().equals("") ){
		
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
		
			
		}			
	else if (parent.button1.getText()==parent.button7.getText() && parent.button7.getText() == "X"&& !parent.button4.getText().equals("") ){
			
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
			
		}			
	else if (parent.button4.getText()==parent.button7.getText() && parent.button7.getText() == "X"&& !parent.button1.getText().equals("") ){
		
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
		
		}	
	else if (parent.button2.getText()==parent.button5.getText() && parent.button5.getText() == "X"&& !parent.button8.getText().equals("") ){
			
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
			
		}	
	else if (parent.button5.getText()==parent.button8.getText() && parent.button8.getText() == "X"&& !parent.button2.getText().equals("") ){
			
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
			
		}	
	else if (parent.button2.getText()==parent.button8.getText() && parent.button8.getText() == "X"&& !parent.button5.getText().equals("") ){
			
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
			
		}	
	else if (parent.button3.getText()==parent.button6.getText() && parent.button6.getText() == "X"&& !parent.button9.getText().equals("") ){
		
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
		
			
		}	
	else if (parent.button6.getText()==parent.button9.getText() && parent.button9.getText() == "X"&& !parent.button3.getText().equals("") ){
			
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
			}
	else if (parent.button3.getText()==parent.button9.getText() && parent.button9.getText() == "X"&& !parent.button6.getText().equals("") ){
			
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
			
		}	
	else if (parent.button1.getText()==parent.button5.getText() && parent.button5.getText() == "X"&& !parent.button9.getText().equals("") ){
	
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
			
		}	
	else if (parent.button5.getText()==parent.button9.getText() && parent.button9.getText() == "X"&& !parent.button1.getText().equals("") ){
			
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
			
		}	
	else if (parent.button1.getText()==parent.button9.getText() && parent.button9.getText() == "X"&& !parent.button5.getText().equals("") ){
	
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
			
		}	
	else if (parent.button3.getText()==parent.button5.getText() && parent.button5.getText() == "X"&& !parent.button7.getText().equals("") ){
			
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
			
		}	
	else if (parent.button5.getText()==parent.button7.getText() && parent.button7.getText() == "X"&& !parent.button3.getText().equals("") ){
			
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
			
		}	
	else if (parent.button3.getText()==parent.button7.getText() && parent.button7.getText() == "X"&& !parent.button5.getText().equals("") ){
			
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
			
	}
	
	
	
	
		
	else if (parent.button1.getText()==parent.button2.getText() && parent.button2.getText() == "O" && !parent.button3.getText().equals("")) {
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;}
		
	else if (parent.button2.getText()==parent.button3.getText() && parent.button2.getText() == "O" && !parent.button1.getText().equals("")){
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
		
	}
	else if (parent.button1.getText()==parent.button3.getText() && parent.button3.getText() == "O" && !parent.button2.getText().equals("")){
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
	}
	else if (parent.button4.getText()==parent.button5.getText() && parent.button4.getText() == "O"&& !parent.button6.getText().equals("")){
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
				}
	else if (parent.button5.getText()==parent.button6.getText() && parent.button5.getText() == "O"&& !parent.button4.getText().equals("")){

		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
		}	
	else if (parent.button4.getText()==parent.button6.getText() && parent.button4.getText() == "O"&& !parent.button5.getText().equals("")){
	
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
			}
	else if (parent.button7.getText()==parent.button8.getText() && parent.button7.getText() == "O"&& !parent.button9.getText().equals("")){

		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
		}	
	else if (parent.button8.getText()==parent.button9.getText() && parent.button8.getText() == "O"&& !parent.button7.getText().equals("")){

		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
		}	
	else if (parent.button7.getText()==parent.button9.getText() && parent.button7.getText() == "O"&& !parent.button8.getText().equals("")){

		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
		}
	else if (parent.button1.getText()==parent.button4.getText() && parent.button4.getText() == "O"&& !parent.button7.getText().equals("")){
	
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
		}	
	else if (parent.button1.getText()==parent.button7.getText() && parent.button7.getText() == "O"&& !parent.button4.getText().equals("")){
	
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
		}	
	else if (parent.button4.getText()==parent.button7.getText() && parent.button7.getText() == "O"&& !parent.button1.getText().equals("")){
	
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
		}
	else if (parent.button2.getText()==parent.button5.getText() && parent.button5.getText() == "O"&& !parent.button8.getText().equals("")){

		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
		}
	else if (parent.button5.getText()==parent.button8.getText() && parent.button8.getText() == "O"&& !parent.button2.getText().equals("")){
	
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
	}
	else if (parent.button2.getText()==parent.button8.getText() && parent.button8.getText() == "O"&& !parent.button5.getText().equals("")){

		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
		}
	else if (parent.button3.getText()==parent.button6.getText() && parent.button6.getText() == "O"&& !parent.button9.getText().equals("")){
	
	
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
		
	}	
	else if (parent.button6.getText()==parent.button9.getText() && parent.button9.getText() == "O"&& !parent.button3.getText().equals("")){
	
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
	}
	else if (parent.button3.getText()==parent.button9.getText() && parent.button9.getText() == "O"&& !parent.button6.getText().equals("")){
		
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
	}
	else if (parent.button1.getText()==parent.button5.getText() && parent.button5.getText() == "O"&& !parent.button9.getText().equals("")){
	
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
		
		}
	else if (parent.button5.getText()==parent.button9.getText() && parent.button9.getText() == "O"&& !parent.button1.getText().equals("")){
		
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
		}
	else if (parent.button1.getText()==parent.button9.getText() && parent.button9.getText() == "O"&& !parent.button5.getText().equals("")){
	
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
	}
	else if (parent.button3.getText()==parent.button5.getText() && parent.button5.getText() == "O"&& !parent.button7.getText().equals("")){
	
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
		}
	else if (parent.button5.getText()==parent.button7.getText() && parent.button7.getText() == "O"&& !parent.button3.getText().equals("")){
	
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;
		}
	else if (parent.button3.getText()==parent.button7.getText() && parent.button7.getText() == "O"&& !parent.button5.getText().equals("")){
		squares[n].setText("O");
		squares[n].setEnabled(false);
		parent.textField.setText("Случайный ход на № "+(n+1));
		return;}
		
		
		
		
			
				else{
					
					squares[n].setText("O");
					squares[n].setEnabled(false);
					parent.textField.setText("Случайный ход на № "+(n+1));
					
					
				}
				
			
			}	
			
		

		
		
	
	
		//Конец блока препятствования	
	public int goEmpty(){
		int go=0;
	boolean	goToEmpty = false;

	
	JButton squares [] = new JButton[9];
	squares [0] = parent.button1;
	squares [1] = parent.button2;
	squares [2] = parent.button3;
	squares [3] = parent.button4;
	squares [4] = parent.button5;
	squares [5] = parent.button6;
	squares [6] = parent.button7;
	squares [7] = parent.button8;
	squares [8] = parent.button9;
	
	do {
		go = r.nextInt(8);
		if (squares[go].getText().equals("")){
			goToEmpty = true;
		}
	}while(!goToEmpty);
	return go;
	}
	

	
}
