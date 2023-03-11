package POM_scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.actiTimeEnterTimeTrack_page;
import POM_pages.actiTimeLogin_page;

public class actiTimeEnterTimeTrack_Script {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.actitime.com/login.do");
		
		actiTimeLogin_page ob1 = new actiTimeLogin_page(driver);
		ob1.tbUsername.sendKeys("admin");
		ob1.tbPassword.sendKeys("manager");
		ob1.btnLogin.click();
		
		actiTimeEnterTimeTrack_page ob2 = new actiTimeEnterTimeTrack_page(driver);
        ob2.btnLogoutlink.click();

	}

}
