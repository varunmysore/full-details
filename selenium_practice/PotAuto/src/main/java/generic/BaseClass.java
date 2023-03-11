package generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	public static final String userDir = System.getProperty("user.dir");
	public static final String chromeKey = "webdriver.chrome.driver";
	public static final String geckoKey = "webdriver.gecko.driver";
	public static final String chromeValue = userDir + "\\drivers\\chromedriver.exe";
	public static final String geckoValue = userDir + "\\drivers\\geckodriver.exe";
	public static final String excelpath = userDir + "\\data\\actidata.xlsm";

	public WebDriver driver;
	public static Properties p;
	public static ActionUtils util;

	@BeforeClass
	public void setPath() {

		try {
			FileInputStream f = new FileInputStream(userDir + "\\data\\acti.properties");
			p = new Properties();
			p.load(f);
		} catch (Exception e) {

			e.printStackTrace();
		}

		System.setProperty(chromeKey, chromeValue);
		System.setProperty(geckoKey, geckoValue);

	}

	@Parameters("BrowserName")
	@BeforeMethod
	public void launchBrowser(String bn) {
		if (bn.equals("chrome"))
			driver = new ChromeDriver();
		else if (bn.equals("firefox"))
			driver = new FirefoxDriver();
		else if (bn.equals("edge"))
			driver = new EdgeDriver();

		util = new ActionUtils(driver);

		// defines implicitly wait of 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// maximizes window//
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
		// driver.get("https://demo.actitime.com/login.do");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@AfterSuite
	public void killDriver() {
		try {
			Runtime.getRuntime().exec("taskkill /IM chromedriver.exe /F");
			Runtime.getRuntime().exec("taskkill /IM geckodriver.exe /F");
			Runtime.getRuntime().exec("taskkill /IM edgedriver.exe /F");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
