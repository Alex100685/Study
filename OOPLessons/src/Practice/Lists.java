package Practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lists {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int count=0;
	
	
	 Developer [] list = new Developer [n];
	JuniorDeveloper [] listj = new JuniorDeveloper[1];
	MidleDeveloper [] listm = new MidleDeveloper[1];
	SeniorDeveloper [] lists = new SeniorDeveloper[1];
	
	public Developer [] deleteByParam(String name, double salary, int experience) throws NoSuchDeveloperException{
		
		
		for (int i=0; i<list.length; i++){
			double s =list[i].getSalary();
			String sd = String.valueOf(s);
			String sds = String.valueOf(salary);
			String exp = String.valueOf(list[i].getExperience());
			String ex = String.valueOf(experience);
			if (list[i].getName().equals(name) && sd.equals(sds) && exp.equals(ex)){
				list[i-1]=list[i];
				System.out.println("Сотрудник под номером "+i+" удален");
				count++;
			}
			
		}Developer d [] = new Developer[list.length-count];
		if(d.length == list.length){
			throw new NoSuchDeveloperException("НЕТ ТАКОГО СОТРУДНИКА В СПИСКЕ!!!");
		}
		for(int i=0; i<d.length; i++){
			d[i] = list[i];
			
		}
		System.out.println("Удалено "+count+" сотрудников!");
		list = d;
		return list;
		
	}
	
	
	public JuniorDeveloper[] addElemJ(){
		if (listj[listj.length-1] != null){
			JuniorDeveloper b[] = new JuniorDeveloper[listj.length+1];
			for (int i=0; i<listj.length; i++){
				b[i]=listj[i];}
				listj = b;
			
		}
		return listj;
		
	}
	public MidleDeveloper[] addElemM(){
		if (listm[listm.length-1] != null){
			MidleDeveloper b[] = new MidleDeveloper[listm.length+1];
			for (int i=0; i<listm.length; i++){
				b[i]=listm[i];}
				listm = b;
			
		}
		return listm;
		
	}
	public SeniorDeveloper[] addElemS(){
		if (lists[lists.length-1] != null){
			SeniorDeveloper b[] = new SeniorDeveloper[lists.length+1];
			for (int i=0; i<lists.length; i++){
				b[i]=lists[i];}
				lists = b;
			
		}
		return lists;
		
	}
	public void add(Developer j, Developer[] a){
		for (int i=0; i<a.length; i++){
			if (a[i]==null){
				a [i] = j;
		if (j instanceof JuniorDeveloper){
			addElemJ();
		}if (j instanceof MidleDeveloper){
			addElemM();
		}if (j instanceof SeniorDeveloper){
			addElemS();
		}break;
				
}
		}}
	public static void main (String [] args){
		
		
		Lists li = new Lists();
		
		
		String name = null;
		double salary = 0;
		int experience = 0;
		
	Random r = new Random();
	
	String [] names = {"Вася", "Жора", "Петя", "Кузя", "Ваня", "Саня"};
	


for (int i=0; i<li.list.length; i++){
	int n =r.nextInt(3);
	int s = r.nextInt(3000);
	int exp = r.nextInt(10);
	if(n==0){
		
		li.list [i] = new JuniorDeveloper(name, salary, experience);
	}if(n==1){
		li.list [i] = new MidleDeveloper(name, salary, experience);
	}if (n==2){
		li.list [i] = new SeniorDeveloper(name, salary, experience);
	}
	li.list[i].setSalary(s);
	li.list[i].setExp(exp);
	int k = r.nextInt(6);
		li.list[i].setName(names[k]);
	
}

for (int i=0; i<li.list.length; i++){
	if (li.list[i] instanceof SeniorDeveloper && li.list[i].getSalary()>1500){
		System.out.println("Старший разработчик "+li.list[i].getName()+", с зарплатой "+li.list[i].getSalary()+" долларов, c опитом "+li.list[i].getExperience()+" года");
	}
}

for(int i=0;i<li.list.length;i++){
	if (li.list[i] instanceof JuniorDeveloper){
	li.add( li.list[i],li.listj);
	}
	if (li.list[i] instanceof MidleDeveloper){
		li.add(li.list[i],li.listm);
		}
	if (li.list[i] instanceof SeniorDeveloper){
		li.add( li.list[i],li.lists);
		}
}
System.out.println("Джуниоры______________________________");

for(int i=0; li.listj[i]!=null; i++){
	System.out.println("Младший разработчик "+li.listj[i].getName()+", с зарплатой "+li.listj[i].getSalary()+" долларов, c опитом "+li.listj[i].getExperience()+" года");
}
System.out.println("Мидлы______________________________");

for(int i=0; li.listm[i]!=null; i++){
	
	System.out.println("Мидл разработчик "+li.listm[i].getName()+", с зарплатой "+li.listm[i].getSalary()+" долларов, c опитом "+li.listm[i].getExperience()+" года");
}
System.out.println("Сеньйоры______________________________");

for(int i=0; li.lists[i]!=null; i++){
	System.out.println("Сеньйор разработчик "+li.lists[i].getName()+", с зарплатой "+li.lists[i].getSalary()+" долларов, c опитом "+li.lists[i].getExperience()+" года");
}

System.out.println("Введите номер сотрудника, которого необходимо уволить!!!");
int p = li.sc.nextInt();
System.out.println("Разработчик "+li.list[p].getLevel()+" "+li.list[p].getName()+", с зарплатой "+li.list[p].getSalary()+" с опытом "+li.list[p].getExperience()+" удаляется...");
for (int i=p+1; i<li.list.length; i++){
	li.list[i-1]=li.list[i];
}
Developer arr[] = new Developer[li.list.length-1];
for(int i=0; i<li.list.length-1; i++){
	arr[i]=li.list[i];
}
li.list = arr;
System.out.println("Сотрудник удален!");
System.out.println("Введите имя сотрудника, которого хотите удалить!");

String nameToDelete= li.sc.nextLine();
nameToDelete= li.sc.nextLine();
System.out.println("Введите зарплату сотрудника, которого хотите удалить!");
double salaryToDelete = li.sc.nextDouble();
System.out.println("Введите опыт сотрудника, которого хотите удалить!");
int expToDelete;
expToDelete = li.sc.nextInt();

try {
	li.deleteByParam(nameToDelete, salaryToDelete, expToDelete);
} catch (NoSuchDeveloperException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("n - сортировать по имени, s - сортировать по зарплате, e - сортировать по опыту!");
String sortation = li.sc.nextLine();
sortation = li.sc.nextLine();
if (sortation.equals("s")){
Arrays.sort(li.list, new ComparatorDeveloperSalary());
for(Developer d:li.list){
	System.out.println("Разработчик "+d.getLevel()+" "+d.getName()+", с зарплатой "+d.getSalary()+" с опытом "+d.getExperience()+" лет");
}}
else if (sortation.equals("n")){
Arrays.sort(li.list, new ComparatorDeveloperName());
for(Developer d:li.list){
	System.out.println("Разработчик "+d.getLevel()+" "+d.getName()+", с зарплатой "+d.getSalary()+" с опытом "+d.getExperience()+" лет");
}}
else if (sortation.equals("e")){
Arrays.sort(li.list, new ComparatorDeveloperExperience());
for(Developer d:li.list){
	System.out.println("Разработчик "+d.getLevel()+" "+d.getName()+", с зарплатой "+d.getSalary()+" с опытом "+d.getExperience()+" лет");
}


}
	
	
	




	}}


	

