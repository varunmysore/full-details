package script;

import org.testng.annotations.Test;

import generic.Basedata;
import pompages.initiaizePage;

public class Test2 extends Basedata {
	@Test
	public void addUser() {
		initiaizePage pages = new initiaizePage(driver);
		pages.lp.enterloginDetails(p.getProperty("email"), p.getProperty("password"));
		
	}
}
