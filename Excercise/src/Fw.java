import java.io.*; 
import java.util.Arrays;
import java.util.Random;
public class Fw {
public static void main(String[] args) {
File ff=new File("a.txt");
try{
if(!ff.exists()){
ff.createNewFile();
}
PrintWriter pw=new PrintWriter(ff.getAbsoluteFile());
Random r = new Random();

try {
	int a [][] = new int [10][10];
for(int i=0;i<a.length;i++){
	for (int j=0;j<a[i].length;j++){
		a [i][j]= r.nextInt(9);
		pw.println(Arrays.toString(a));
	}
}
for(int i=0;i<a.length;i++){
	for (int j=0;j<a[i].length;j++){
		pw.print(a[i][j]+" ");
	}pw.println();
}





}
finally {
pw.close();
}
}catch(IOException e) {
System.out.println("ERROR!");
}
}}