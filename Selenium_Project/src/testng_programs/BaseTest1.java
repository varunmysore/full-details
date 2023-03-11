package testng_programs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest1 {
	
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


}
