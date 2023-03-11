package synchronisation_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
//fluent wait program
public class P6 {

	public static void main(String[] args)  {
		// sets the path for chromedrriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
	
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
		
		//creates  an object of fluent wait
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		//specifies polling period and timeout period
		wait.pollingEvery(Duration.ofMillis(250));
		wait.withTimeout(Duration.ofSeconds(30));
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='content users']")));
	
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		

		
	}

}
