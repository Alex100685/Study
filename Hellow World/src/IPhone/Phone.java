package IPhone;

public abstract class Phone {
	
	protected boolean touch;
	protected boolean hasWifi;
	protected int screenSize;
	protected int countCall;
	protected int countSms;
	protected String myPhoneNumber;
	int p = 0;
	


		
	
	
	public Phone() {
		System.out.println("Phone constructor");
	}

	
	public boolean isTouch() {
		return touch;
	}
	
	public boolean isHasWifi() {
		return hasWifi;
	}
	
	public int getScreenSize() {
		return screenSize;
	}
	
	public String call(String number) {
		System.out.println("Phone class is calling " + number);
		countCall++;
		return number;
			}
	
	
	public int getCountCall (){
		
		return countCall;	
	}
public int getCountSms (){
		
		return countSms;	
	}
	
public String getPhoneNumber(){
	return myPhoneNumber;
}

	
	
	public abstract void sendSMS(String number, String message);

	public void phoneRespond() {
		// TODO Auto-generated method stub
		
	}
	
}
