package lesson6;

public class Main {
public static class Counter extends Thread {
public void run() {
int x = 1;
while ( ! isInterrupted()) { // ������� ���������� ������ �1
System.out.println(getId() + ": " + x++);
try {
Thread.sleep(1000); // ����������������
// Thread.yield(); // ��� ���
} catch (InterruptedException e) {
return; // ������� ���������� ������ �2
}
}
}
}
public static void main(String[] args) {
try {
Counter c = new Counter();
c.start(); // ��������� �����
Thread.sleep(5000); // ���� 5 ���
c.interrupt(); // ��������� �����
} catch (Exception e) {
;
}
}
}