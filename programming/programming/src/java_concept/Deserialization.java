package java_concept;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
public static void main(String[] args) throws Throwable {
	FileInputStream f2 = new FileInputStream("abc.txt");
	ObjectInputStream o2 = new ObjectInputStream(f2);
	Serial1 s1 = (Serial1) o2.readObject();
	System.out.println(s1.hand);
	System.out.println(s1.leg);
	System.out.println(s1.name);
}
}
