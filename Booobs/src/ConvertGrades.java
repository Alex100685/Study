
public class ConvertGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReportCards rc = new ReportCards();
		char yourGrade = rc.convertGrades(70);
		
		System.out.println ("���� ������ ������" +yourGrade);
		yourGrade = rc.convertGrades(88);
		System.out.println ("���� ������ ������ " +yourGrade);
		

	}

}
