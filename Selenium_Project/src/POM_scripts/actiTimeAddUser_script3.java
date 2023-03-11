package POM_scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.initialisePages;

public class actiTimeAddUser_script3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.actitime.com/login.do");
		
		initialisePages pages = new initialisePages(driver);
		pages.actiTimeLogin.login("admin", "manager");
		pages.actiTimeEnter.clickUsers();
		pages.actiTimeUser.clickNewUser();
		Thread.sleep(2000);
		pages.AddUser.addUser("abhi", "d", "abhid@gmail.com");

	}

}
