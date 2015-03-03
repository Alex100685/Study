package Birds;

public abstract class Bird {
	
	protected int weight;
	protected int height;
	protected int width;
	protected int depth;
	protected String name;
	protected boolean predator;
	protected boolean wild;
	protected String wildt = "�����";
	protected String wildh = "��������";
	
	
	Bird(){
		System.out.println("������ �����������");
	}
	
	public String isWildtext(){
		if(wild == true){
			return wildt;
		}else{
		return wildh;}
		
		
	}
	
	
	public void introduction(){
		System.out.println("������, ���� ����� "+getName()+". � "+isWildtext()+" �����. ��� ���� "+getHeight()+" ��, ������ ������� "+getWidth()+" ��, ����� ������ "+getDepth()+"��, ��� ��� "+getWeight()+" ��");
	}
	
	
	private String getName() {
		return name;
	}

	public void fly(){
		System.out.println("�, ����!");
	}
	
	public void eat(){
		if (predator == true){
		System.out.println("� �� ��������� � ������� ��������!");}
		else {
			System.out.println("� ����� �����!");
		}
	}
	
	abstract void run();
	
	
	
	public void sleep(){
		System.out.println("� ����!");
	}
	
	public boolean isWild(){
		return wild;
		
	}
	public boolean isPredator(){
		return predator;
		
	}
	public int getWeight(){
		return weight;
	}
	
	public int getHeight(){
		return height;
	}
	public int getWidth(){
		return width;
	}
	public int getDepth(){
		return depth;
	}
	
	
	

}
