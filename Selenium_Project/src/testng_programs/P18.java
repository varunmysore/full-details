package testng_programs;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class P18 {
	@Test
	public void actiLogin() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	// launches the chrome browser
	WebDriver driver = new ChromeDriver();
	SoftAssert s= new SoftAssert();
//	
	Set<String> allHandles = driver.getWindowHandles();
	s.assertEquals(allHandles.size(), 0);
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	// maximizes window//
	driver.manage().window().maximize();
	// fetches the web application and waits until it is loaded
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(2000);
	String expectedPageTitle="actiTIME ";
	String landingPageTitle=driver.getTitle();
	s.assertEquals(landingPageTitle, expectedPageTitle);
	
	WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
	//Assert.assertEquals(link.isDisplayed(), true);
	s.assertTrue(link.isDisplayed());
	
	WebElement box = driver.findElement(By.id("keepLoggedInCheckBoxContainer"));
	s.assertEquals(box.isSelected(), false);
	
	s.assertAll();
}
}