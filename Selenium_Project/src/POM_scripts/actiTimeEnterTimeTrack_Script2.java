package POM_scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.actiTimeEnterTimeTrack_page2;
import POM_pages.actiTimeLogin_page2;

public class actiTimeEnterTimeTrack_Script2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.actitime.com/login.do");
		
		actiTimeLogin_page2 ob1 = new actiTimeLogin_page2(driver);
		ob1.login("admin", "manager");
		
		actiTimeEnterTimeTrack_page2 ob2 = new actiTimeEnterTimeTrack_page2(driver);
        ob2.clickUsers();

	}

}
