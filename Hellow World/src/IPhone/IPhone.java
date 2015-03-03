package IPhone;

public class IPhone extends Phone {
	//private int countcallIphone = 0;
	private int countSmsIphone = 0;
	
	public IPhone() {
		System.out.println("IPhone constructor");
		
		touch = true;
		hasWifi = true;
		screenSize = 3;
		myPhoneNumber = "111-11-11";
		
	}
	

	
	@Override
	final public String call(String number) {
		System.out.println("IPhone class is calling " + number);
		super.countCall++;
		
				return number;
			
			}
		
	
	
	@Override
	public void sendSMS(String number, String message) {
		System.out.println("IPhone class is sending sms " + message + " to " + number);	
		super.countSms++;
	}

	public void phoneRespond (){
		System.out.println("Абонент Айфон под номером 111-11-11 слушает");
	}


}
