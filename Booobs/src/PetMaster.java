
public class PetMaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String petReaction;
String petReaction2;
Pet myPet = new Pet ();
myPet.eat();
petReaction = myPet.say("��� �����!");
System.out.println(petReaction);
myPet.sleep();
petReaction2 = myPet.fight ("�������! ����! ����!");
System.out.println(petReaction2);
	}

}
