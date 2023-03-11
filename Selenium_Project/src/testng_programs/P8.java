package testng_programs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class P8 extends BaseTest2 {
	@Test
	public void actiLoginScript() {

		// fetches the web application and waits until it is loaded
		driver.get("https://demo.actitime.com/login.do");
		// identifies username and enters data
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		// identifies password and enters data
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		// identifies login button and click
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
	}
}
