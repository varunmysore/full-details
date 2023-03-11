package testng_programs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest2 {
	WebDriver driver;

	@BeforeClass
	public void preclass() {
		System.out.println("preclass");
		// sets the path for chromedrriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		driver = new ChromeDriver();
		// defines implicitly wait of 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// maximizes window//
		driver.manage().window().maximize();
	}

	@AfterClass
	public void postclass() {
		System.out.println("postclass");
		// closes browser
		driver.close();
	}

}
