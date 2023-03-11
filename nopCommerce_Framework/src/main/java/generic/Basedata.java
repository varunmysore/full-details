package generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Basedata {
	public static final String userDir = System.getProperty("user.dir");
	public static final String chromeKey = "webdriver.chrome.driver";
	public static final String geckoKey = "webdriver.gecko.driver";
	public static final String chromeValue = userDir + "\\drivers\\chromedriver.exe";
	public static final String geckoValue = userDir + "\\drivers\\geckodriver.exe";
	public static final String excelpath = userDir + "\\data\\actidata1.xlsx";
	public WebDriver driver;
	public static Properties p;
	public static actionUtils utils;

	@BeforeClass
	public void setPath() {
		try {
			FileInputStream f = new FileInputStream(userDir + "\\data\\noCommerce.properties");
			p = new Properties();
			p.load(f);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.setProperty(chromeKey, chromeValue);
		System.setProperty(geckoKey, geckoValue);
	}

	@Parameters("browsername")
	@BeforeMethod
	public void launchBrowser(String bn) {
		if (bn.equals("chrome"))
			driver = new ChromeDriver();
	
		else if (bn.equals("firefox"))
			driver = new FirefoxDriver();
		utils=new actionUtils(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));

	}

	@AfterMethod
	public void closebrowser() {
		driver.quit();

	}

	@AfterSuite
	public void killtask() {
		try {
			Runtime.getRuntime().exec("taskkill /IM chromedriver.exe /F");
			Runtime.getRuntime().exec("taskkill /IM geckodriver.exe /F");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
