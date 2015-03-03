package IPhone;

public class PhoneList {
	
	int p = 0;
	
	Phone [] phoneList = new Phone [4];
	
	public void add(Phone ph){
		
		phoneList [p++] = ph;
		
	}
	
	public int find(String number){
		for(int i = 0; i<p; i++){
			if (phoneList[i].getPhoneNumber().equals(number))
				return i;
			
			}return -1;
			
			
		
		
	}
	
	

}
