package testng_programs;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P16 {
	@Test
	public void actiLogin() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	// launches the chrome browser
	WebDriver driver = new ChromeDriver();
	Set<String> allHandles = driver.getWindowHandles();
	Assert.assertEquals(allHandles.size(), 1);
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	// maximizes window//
	driver.manage().window().maximize();
	// fetches the web application and waits until it is loaded
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(2000);
	String expectedPageTitle="actiTIME - Login";
	String landingPageTitle=driver.getTitle();
	Assert.assertEquals(landingPageTitle, expectedPageTitle);
	
	//identifies username and enters data
	driver.findElement(By.name("username")).sendKeys("admin");
	//identifies password and enters data
	driver.findElement(By.name("pwd")).sendKeys("manager");
	//identifies login button and click
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	String expectedLanding="actiTIME - Enter Time-Track";
	String actualLanding=driver.getTitle();
	
	Assert.assertEquals(expectedLanding, actualLanding);
	
	
	}
	
	
	
}
