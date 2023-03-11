package practice2;

import java.io.File;
import java.io.IOException;

public class File_prog {

	public static void main(String[] args) throws IOException {
		File f1 = new File("dileep");
		f1.mkdir();
		File f2 = new File(f1,"aish");
		f2.mkdir();
		File f3 = new File("dileep","lavanya.txt");
		f3.createNewFile();

	}

}
