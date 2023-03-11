package testng_programs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P13 {
	@DataProvider
	public Object[] demo() {
		Object[] d=new Object[4];
		d[0]="java";
		d[1]=100;
		d[2]=80.5f;
		d[3]='$';
		return d;			
	}
	
	@Test(dataProvider="demo")
	public void script(Object ob) {
	System.out.println(ob);
	}
}
