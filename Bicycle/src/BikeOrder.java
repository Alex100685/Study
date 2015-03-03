import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JOptionPane;
public class BikeOrder implements ActionListener {
	
	String su = new String ("Ukraine");
	String so = new String ("Orlenok");
	
	
	
	OrderWindow parent;
	
	BikeOrder (OrderWindow parent){
		this.parent = parent;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	 
		JButton clickedButton = (JButton) e.getSource();
		String typeName = parent.bicycleTypeField.getText();
		int result;
		int typeValue = 0;
		int quantValue;
		if (typeName.equals(su)){
			typeValue = 30;
		}else if(typeName.equals(so)){
			typeValue = 10;
	
		}else{
			JOptionPane.showConfirmDialog(null, "Такого велосипеда не существует!!! Введите марку существующего велосипеда","Обработка заказа", JOptionPane.PLAIN_MESSAGE);
		return;
		}
		
		
		String quantName = parent.quantetyField.getText();
		quantValue = Integer.parseInt(quantName);
		
		
			result = typeValue * quantValue;
			
		try {
			validateOrder(typeName, quantName, result);
			
			
			JOptionPane.showConfirmDialog(null, "Ваш заказ создан","Обработка заказа", JOptionPane.PLAIN_MESSAGE);
			
		
		}catch (TooManyBikesException e1){
			JOptionPane.showConfirmDialog(null, e1.getMessage(),"Обработка заказа", JOptionPane.PLAIN_MESSAGE);
		}
		
		
		}
	static void validateOrder (String typeName, String quantName, int result) throws TooManyBikesException {
		if (result>200) { throw new TooManyBikesException ("Велосипеды марки " +typeName+ " в количестве " +quantName+ " не "
				+ "влезут в кузов грузовика ");
			
		}
		
		
	}
	
	
	
	
	

}
