package testng_programs;

import org.testng.annotations.Test;

public class P20 {

	@Test(priority = -10) //by default priority is 0
	public void loginScript() {
		System.out.println("from login script");
	}

	@Test(priority = -2)
	public void logoutScript() {
		System.out.println("from logoutScript script");
	}

	@Test(priority = 5,invocationCount=5)
	public void userScript() {
		System.out.println("from userScript script");
	}

	@Test(priority = 7)
	public void createUserScript() {
		System.out.println("from createUserScript script");
	}

}
