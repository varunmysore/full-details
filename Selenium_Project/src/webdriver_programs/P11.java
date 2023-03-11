package webdriver_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P11 {

	public static void main(String[] args) throws InterruptedException {
		// sets the path for chromedrriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// maximizes window//
		driver.manage().window().maximize();
		// fetches the web application and waits until it is loaded
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		
		Thread.sleep(5000);
		multipleTabs(driver);
	}
        
	public static void multipleTabs(WebDriver driver)
	{
	  String maintab = driver.getWindowHandle();
	 Set<String> alltabs = driver.getWindowHandles();
	 
	 for(String lv:alltabs)
	 {
		 driver.switchTo().window(lv);
		 if(lv.equals(maintab)) {
			 driver.close();
		 }
		 }
	 }
	}

