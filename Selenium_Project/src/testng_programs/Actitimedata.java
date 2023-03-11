package testng_programs;

import org.testng.annotations.DataProvider;
import apache_programs.P4;

public class Actitimedata {

	@DataProvider
		public Object[][] actiLoginData() {
			Object[][] d=new Object [3][2];
			d[0][0]="admin";
			d[0][1]="manager";
			d[1][0]="trainee";
			d[1][1]="trainee";
			d[2][0]="java";
			d[2][1]="selenium";
			return d;
		}
	@DataProvider
	public Object[][] newuser() throws Throwable {
		Object[][] d=new Object [1][5];
		d[0][0]=P4.getData("adduser", 1, 0);
		d[0][1]=P4.getData("adduser", 1, 1);
		d[0][2]=P4.getData("adduser", 1, 2);
		d[0][3]=P4.getData("adduser", 1, 3);
		d[0][4]=P4.getData("adduser", 1, 4);
		return d;
	}
}
