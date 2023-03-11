package generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest_fp2 {

	public static final String userDir = System.getProperty("user.dir");
	public static final String chromeKey = "webdriver.chrome.driver";
	public static final String chromeValue = "chromedriver.exe";
	public static final String geckoKey = "webdriver.gecko.driver";
	public static final String geckoValue = "geckodriver.exe";
	public static final String excelPath = userDir + "\\data\\actidata.xlsm";

	public WebDriver driver;
	public static Properties p;
	public static ActionUtil_fp2 util;

	@BeforeClass
	public void setPath_mtd(String excelPath) {
		try {
			FileInputStream f = new FileInputStream(excelPath);
			p = new Properties();
			p.load(f);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.setProperty(chromeKey, chromeValue);
		System.setProperty(geckoKey, geckoValue);
	}

	@BeforeMethod
	public void launchbrwsr_mtd(String bn) {
		if (bn.equals("chrome"))
			driver = new ChromeDriver();
		if (bn.equals("firefox"))
			driver = new FirefoxDriver();
		util = new ActionUtil_fp2(driver);
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
	} 
	
	@AfterMethod
	public void closeBrowser_mtd(){
		driver.quit();
	}

	@AfterSuite
	public void killBrowser_mtd() {
		try {
			Runtime.getRuntime().exec("taskkill /IM chromedriver.exe /F");
			Runtime.getRuntime().exec("taskkill /IM geckodriver.exe /F");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
