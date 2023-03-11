package testng_programs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest3 {
	WebDriver driver;

	@Parameters("BrowserName") // asks beforemethod to get value from xml file from name browsername.
	@BeforeMethod
	public void precondition(String bn) {
		
		System.out.println("before method");
		// sets the path for chromedrriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

		if (bn.equals("chrome"))
			driver = new ChromeDriver();
		else if (bn.equals("firefox"))
			driver = new FirefoxDriver();
		else if (bn.equals("edge"))
			driver = new EdgeDriver();

		// defines implicitly wait of 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// maximizes window//
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void postcondition() {
		System.out.println("after method");
		// closes browser
		driver.close();
	}
	
	@Parameters("BrowserName")
	@BeforeTest
	public void pretest(String bn) {
		System.out.println(bn+"test started the execution");
	}

	@Parameters("BrowserName")
	@AfterTest
	public void posttest(String bn) {
		System.out.println(bn+"test completed the execution");
	}
	
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("suite started the execution");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("suite completed the execution");
	}
	
	

}
