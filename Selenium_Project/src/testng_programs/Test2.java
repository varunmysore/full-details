package testng_programs;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test2 extends BaseTest1{
	@Test
	public void fbLoginScript() {
		// fetches the web application and waits until it is loaded
		driver.get("https://www.facebook.com/");
		// identifies the UserName using id//
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abhi");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345");
		driver.findElement(By.xpath("//button[@name='login']")).submit();
	}
}
