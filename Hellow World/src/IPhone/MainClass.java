package IPhone;

public class MainClass {

	public static void main(String[] args) {
		// Phone p = new Phone(); ������ �.�. ����� �����������
		
		
		PhoneList pl = new PhoneList();
		Nokia3310 nokia = new Nokia3310();
		IPhone iphone = new IPhone();
		IPhone5 iphone5 = new IPhone5();
		SamsungS4 samsung = new SamsungS4();
		pl.add(nokia);
	    pl.add(iphone);
		pl.add(iphone5);
		pl.add(samsung);
		int phonecall;
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("Nokia3310 screent size: " + nokia.getScreenSize());
		phonecall = pl.find(nokia.call("444-44-44"));
		pl.phoneList[phonecall].phoneRespond();
		nokia.sendSMS("444-44-44", "������, �� ����� ����");
		System.out.println("���������� ������� ����� " +nokia.getCountCall());
		System.out.println("���������� ��� ����� " +nokia.getCountSms());
		
		
		System.out.println("----------------------------------");
		
		
		System.out.println("IPhone screent size: " + iphone.getScreenSize());
		phonecall =pl.find(iphone.call("333-33-33"));
		pl.phoneList[phonecall].phoneRespond();
		iphone.sendSMS("222-22-22", "������, �� ������� ����� ����");
		System.out.println("���������� ������� ������ " +iphone.getCountCall());
		System.out.println("���������� ��� ������ " +iphone.getCountSms());
		
		
		System.out.println("----------------------------------");
		
		
		System.out.println("IPhone screent size: " + iphone5.getScreenSize());
		phonecall =pl.find(iphone5.call("222-22-22"));
		pl.phoneList[phonecall].phoneRespond();
		iphone5.sendSMS("333-33-33", "������, �� �����5 ����");
		System.out.println("���������� ������� �����5 " +iphone5.getCountCall());
		System.out.println("���������� ��� �����5 " +iphone5.getCountSms());
		
		
		System.out.println("----------------------------------");
		
		
		System.out.println("Samsung screensize size: "+samsung.getScreenSize());
		phonecall =pl.find(samsung.call("111-11-11"));
		pl.phoneList[phonecall].phoneRespond();
		samsung.sendSMS("111-11-11", " Amogo! �� ������� ����");
		System.out.println("���������� ������� ������� " +samsung.getCountCall());
		System.out.println("���������� ��� ������� " +samsung.getCountSms());
		
		
		
		
		
		
		
		
		
		
	}
}
