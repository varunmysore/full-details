package java_concept;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serial2 {
public static void main(String[] args) throws Throwable {
	Serial1 s1 = new  Serial1();
	FileOutputStream f1 = new FileOutputStream("abc.txt");
	ObjectOutputStream o1 = new ObjectOutputStream(f1);
	o1.writeObject(s1);
}
}
