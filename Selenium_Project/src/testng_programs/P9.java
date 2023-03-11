package testng_programs;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class P9 {
	@Parameters("assignment")
	@Test
	public void demo(String data)
	{
		System.out.println(data);
	}

}
