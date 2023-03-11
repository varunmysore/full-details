package testng_programs;

import org.testng.annotations.Test;

public class P21 {

	@Test
	public void loginScript() {
		System.out.println("from login script");
	}

	@Test(dependsOnMethods= {"loginScript"})
	public void logoutScript() {
		System.out.println("from logoutScript script");
	}

	@Test(dependsOnMethods= {"loginScript"})
	public void userScript() {
		System.out.println("from userScript script");
	}

	@Test(dependsOnMethods= {"loginScript","userScript"})
	public void createUserScript() {
		System.out.println("from createUserScript script");
	}

}
