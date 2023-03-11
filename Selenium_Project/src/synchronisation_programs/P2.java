package synchronisation_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//program for explicit wait w.r.t title
public class P2 {

	public static void main(String[] args) throws InterruptedException  {
		// sets the path for chromedrriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		
		// maximizes window//
		driver.manage().window().maximize();
		// fetches the web application and waits until it is loaded
		driver.get("https://demo.actitime.com/login.do");
		//retrieves login page title
		String loginPageTitle = driver.getTitle();
		System.out.println(loginPageTitle);
		
		// identifies username and enters data
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		// identifies password and enters data
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		// identifies login button and click
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		
		//expected title of landing page
		String expectedLandingPageTitle = "actiTIME - Enter Time-Track";
		
		/*Thread.sleep(3000);
		String t = driver.getTitle();
		System.out.println(t);*/
		
		//creates object of webdriverwait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//defines an explicit wait
		wait.until(ExpectedConditions.titleIs(expectedLandingPageTitle));
		
		//retrieves title of landing page
		String actualLandingPageTitle = driver.getTitle();
		System.out.println(actualLandingPageTitle);
		
		
		
		
	
		

		
	}

}