
public class Array {
	public static void main(String[]args){
String[] friends= {"Masha","Dasha","Sasha","Lubasha","Rita"};

String bigFriends = friends[4] + friends[3] + friends[2] + friends [1] + friends [0];

System.out.println(bigFriends);
bigFriends = bigFriends.substring(3,bigFriends.length() - 5);
System.out.println(bigFriends);
System.out.println(bigFriends.trim());
// удаляет все пробелы

}
}