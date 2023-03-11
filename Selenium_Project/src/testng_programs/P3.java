package testng_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P3 {

	WebDriver driver;

	@BeforeMethod
	public void precondition() {
		// sets the path for chromedrriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		driver = new ChromeDriver();
		// defines implicitly wait of 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// maximizes window//
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void postcondition() {
		// closes browser
		driver.close();
	}

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
