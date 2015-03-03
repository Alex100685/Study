package JTable;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

public class MyFrame extends JFrame implements TableModelListener {
	
	MyTableModel myTableModel;
	JTable myTable;
	
	MyFrame (String winTitle){
		super(winTitle);
	
	
	myTableModel = new MyTableModel();
	myTable = new JTable(myTableModel);
	
	add(new JScrollPane(myTable));
	
	myTableModel.addTableModelListener(this);
	}

	@Override
	public void tableChanged(TableModelEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Something changed in data JTable");
	}
	
	public static void main(String [] args){
		MyFrame myFrame = new MyFrame("My Window");
		myFrame.pack();
		myFrame.setVisible(true);
	}
	class MyTableModel extends AbstractTableModel {
		ArrayList<Order> myData = new ArrayList<Order>();
		String [] orderColNames = {"Order ID", "Symbol", "Quantity", "Price"};
		MyTableModel(){
			myData.add(new Order(1, "IBM", 100, 135.5f));
			myData.add(new Order(2, "AAPL", 300, 290.12f));	
			myData.add(new Order(3, "MOT", 2000, 27.8f));	
			myData.add(new Order(4, "ORCL", 500, 27.8f));	
				
		}
		public int getColumnCount(){
			return 4;
		}
		public int getRowCount(){
			return myData.size();
		}
		
		public Object getValueAt(int row, int col){
			switch(col){
			case 0: 
				return myData.get(row).orderID;
			case 1:
				return myData.get(row).stockSymbol;
			case 2:
				return myData.get(row).quantity;
			case 3:
				return myData.get(row).price;
				default:
					return"";
			
			}
		}
		
		public String getColumnName(int col){
			return orderColNames[col];
		}
		public boolean isCellEditable(int row, int col){
			if(col == 2){
				return true;
			}else{
				return false;
			}
		}
		
		public void setValueAt(Object value, int row, int col){
			if (col == 2){
				myData.get(row).quantity=(Integer.valueOf(value.toString()));
			}
		}
		
		
		
	}
	
	

}
