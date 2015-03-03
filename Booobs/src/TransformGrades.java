
public class TransformGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ReportCards rc = new ReportCards();
char yourGrade = rc.convertGrades(70);

switch (yourGrade){
case 'A':
System.out.println("Превосходная работа!");
break;
case 'B':
	System.out.println ("Хорошая работа!");
	break;
case 'C':
	System.out.println ("Надо бы немного подучить!");
	break;
case 'D':
	System.out.println ("Ну ты и дибил!");
	break;
}

		
		
	}

}
