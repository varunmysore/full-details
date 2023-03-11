package synchronisation_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//program for explicit wait w.r.t title
public class P4 {

	public static void main(String[] args) throws InterruptedException  {
		// sets the path for chromedrriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		
		// maximizes window//
		driver.manage().window().maximize();
		// fetches the web application and waits until it is loaded
		driver.get("https://demo.actitime.com/login.do");
		//retrieves login page title
		
		wait.until(ExpectedConditions.titleIs("actiTIME - Login"));
		
		// identifies username and enters data
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		// identifies password and enters data
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		// identifies login button and click
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("a[id='loginButton']")));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='content users']")));
		
		//defines an explicit wait
		//wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		String actualLandingPageTitle = driver.getTitle();
		System.out.println(actualLandingPageTitle);
		
		
	}
	
		

		
	}

