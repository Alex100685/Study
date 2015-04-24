package com.bank;

public class Main {

	public static void main(String[] args) {
		BankEngine be = new BankEngine();
		//��������� ����
		be.openAccount("Petya", "1111111");
		//��������� ���� � ������� � ����
		be.depositAccount("Petya", "UAH", 10000);
		be.withdrawAccount("Petya", "UAH", 1200);
		be.depositAccount("Petya", "USD", 500);
		be.depositAccount("Petya", "EUR", 300);
		be.withdrawAccount("Petya", "EUR", 300);
		
		be.openAccount("Kolya", "5555555");
		//��������� ���� � ������� � ����
		be.depositAccount("Kolya", "UAH", 125);
		be.withdrawAccount("Kolya", "UAH", 113);
		be.depositAccount("Kolya", "USD", 500);
		be.depositAccount("Kolya", "EUR", 900);
		be.withdrawAccount("Kolya", "EUR", 899);
		
		
		
		//�������� �������
		be.accountStatement("Petya");
		be.accountStatement("Kolya");
		//������ �������
		be.accountBalance("Petya");
		be.accountBalance("Kolya");
		
		
	}

}
