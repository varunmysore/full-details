package testng_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class P10 {
	@Test
	public void actiLoginScript()
	{
		// sets the path for chromedrriver.exe
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				// launches the chrome browser
				WebDriver driver = new FirefoxDriver();
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
}