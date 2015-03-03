package Exceptions;
import java.io.File;
import java.io.IOException;
public class Main {
private static void test() {
try {
File f = File.createTempFile("ABC", "DEF");
System.out.println(f. getCanonicalPath());
} catch (IOException e) {
System.out.println(e.getMessage());
}
}
public static void main(String[] args) {
test();
}
}