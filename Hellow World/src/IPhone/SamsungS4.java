package IPhone;

public class SamsungS4 extends Phone {
	private int countSmsSamsungS4 = 0;
	
	
	SamsungS4(){
		
		touch = true;
		hasWifi = true;
		screenSize = 5;
		myPhoneNumber = "444-44-44";
		
		
	}

	@Override
	public void sendSMS(String number, String message) {
		System.out.println("�� �������� ��� �� � ������� : Hello,"+message+"�� ����� :"+number);
		super.countSms++;
		
	}
	public String call(String number) {
		System.out.println("SamsungS4 class is calling " + number);
		super.countCall++;
		
				return number;
	}
			
	
	public void phoneRespond (){
		System.out.println("������� ������� ��� ������� 444-44-44 �������");
	}
	
	
	
	

}
