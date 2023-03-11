package script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class P2 {
@Test
public void actiLoginScript()
{
	// sets the path for chromedrriver.exe
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			// launches the chrome browser
			WebDriver driver = new ChromeDriver();
			//defines implicitly wait of 30 seconds
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			// maximizes window//
			driver.manage().window().maximize();
			// fetches the web application and waits until it is loaded
			driver.get("https://demo.actitime.com/login.do");
			// identifies username and enters data
			driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
			// identifies password and enters data
			driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
			// identifies login button and click
			driver.findElement(By.cssSelector("a[id='loginButton']")).click();
			//closes browser
			driver.close();
}

@Test
public void fbLoginScript()
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	// launches the chrome browser
	WebDriver driver = new ChromeDriver();
	// maximizes window//
	driver.manage().window().maximize();
	// fetches the web application and waits until it is loaded
	driver.get("https://www.facebook.com/");
	// identifies the UserName using id//
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abhi");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345");
	driver.findElement(By.xpath("//button[@name='login']")).submit();
	
	driver.close();
}
}
