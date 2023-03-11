package apache_programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class P7 {
	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream("./data/demo.properties");
		Properties p = new Properties();
		p.load(f);
		
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
	}

}
