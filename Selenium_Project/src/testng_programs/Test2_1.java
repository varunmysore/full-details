package testng_programs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test2_1 extends BaseTest2 {
	@Test
	public void fbLoginScript() {
		System.out.println("test1");
		// fetches the web application and waits until it is loaded
		driver.get("https://www.facebook.com/");
		// identifies the UserName using id//
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abhi");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345");
		driver.findElement(By.xpath("//button[@name='login']")).submit();
	}

	@Test
	public void actiLoginScript() {
		System.out.println("test2");
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