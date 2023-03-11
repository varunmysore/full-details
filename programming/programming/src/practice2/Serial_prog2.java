package practice2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serial_prog2 {
	public static void main(String []args) throws Throwable {
		Serial_prog Sp = new Serial_prog();
		FileOutputStream f = new FileOutputStream("abc.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(Sp);
	}

}
