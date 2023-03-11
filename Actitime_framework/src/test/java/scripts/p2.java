package scripts;

import org.testng.annotations.Test;

import dataproviders.actidata;
import generic.basetest;
import pages.initialisePages;

public class p2 extends basetest{
	
	@Test(dataProviderClass=actidata.class,dataProvider="createUserData")
	public void addUserScript(String un,String pw,String fn,String ln,String em) throws InterruptedException
	{
		initialisePages pages = new initialisePages(driver);
		pages.actiTimeLogin.login(un,pw);
		pages.actiTimeEnter.clickUsers();
		pages.actiTimeUser.clickNewUser();
		Thread.sleep(2000);
		pages.AddUser.addUser(fn,ln,em);

	}
	
}
