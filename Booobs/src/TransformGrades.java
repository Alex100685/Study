
public class TransformGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ReportCards rc = new ReportCards();
char yourGrade = rc.convertGrades(70);

switch (yourGrade){
case 'A':
System.out.println("������������ ������!");
break;
case 'B':
	System.out.println ("������� ������!");
	break;
case 'C':
	System.out.println ("���� �� ������� ��������!");
	break;
case 'D':
	System.out.println ("�� �� � �����!");
	break;
}

		
		
	}

}
