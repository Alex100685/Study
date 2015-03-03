package Example2;

public class StudentList {
	private Student list[] = new Student [1];
	
		
	private int p = 0;

	public void add(Student s) {
		
		list[p++] = s;
		listAddEll();
		}
	
	public Student [] listAddEll(){
		if (list[p-1]==list[list.length-1] && list[p-1]!=null){
			Student [] list2 = new Student [p*2];
			for(int i=0; i<list.length; i++){
				list2 [i]=list[i];
			}
			list = list2;
		}
		
		return list;
	}
	
	
	public Student get(int n) {
		return list[n];
	}
	
	public int find(String name) {
		for (int i = 0; i<p; i++) {
			if (list[i].getName().equalsIgnoreCase(name))
				return i;
		}
		
		return -1;
	}
}
