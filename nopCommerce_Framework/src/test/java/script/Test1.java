package script;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic.Basedata;
import pompages.initiaizePage;

public class Test1 extends Basedata {
	@Test
	public void loginTest() {
		System.out.println("test executed");
		initiaizePage pages = new initiaizePage(driver);
		pages.lp.enterloginDetails(p.getProperty("email"), p.getProperty("password"));
	}}
   
	
//	@Test
//	public void login() throws InterruptedException  {
//		driver.findElement(By.className("email")).sendKeys("varun90@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.className("password")).sendKeys("varun90");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text()='Log in']")).click();
//		Thread.sleep(2000);
//	}
//	
	
	
	
	
	
	
	
	
	


