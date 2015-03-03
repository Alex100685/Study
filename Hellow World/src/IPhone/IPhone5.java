package IPhone;

public class IPhone5 extends IPhone {
	private int countSmsIphone5 = 0;
	
	public IPhone5() {
		System.out.println("IPhone5 constructor");
		myPhoneNumber = "222-22-22";

		screenSize = 4;
	}
	
	/*@Override
	public void call(String number) {
		System.out.println("IPhone class is calling " + number);
	}*/ // ошибка т.к. метод final
	
	@Override
	public void sendSMS(String number, String message) {
		super.sendSMS(number, message);
		System.out.println("IPhone5 class is sending sms " + message + " to " + number);	
		super.countSms++;
		
	}
	public String callIpone5(String number) {
		System.out.println("IPhone class is calling " + number);
		super.countCall++;
		
		return number;
			}
		
	
	


public void phoneRespond (){
	System.out.println("Абонент Айфон5 под номером 222-22-22 слушает");
}}
