package IPhone;

public class Nokia3310 extends Phone {

	
	public Nokia3310() {
		System.out.println("Nokia3310 constructor");
		
		touch = false;
		hasWifi = false;
		screenSize = 2;
		myPhoneNumber = "333-33-33";
	}
	
	@Override
	public String call(String number) {
		//super.call(number);
		System.out.println("Nokia3310 class is calling " + number);
		super.countCall++;
		
				return number;
			
			}
		
		
	
	
	@Override
	public void sendSMS(String number, String message) {
		System.out.println("Nokia3310 class is sending sms " + message + " to " + number);	
		super.countSms++;
	}
	
	public void phoneRespond (){
		System.out.println("Абонент Нокия под номером 333-33-33 слушает");
	}






}
