package POM_scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.actiTimeAddUser_page;
import POM_pages.actiTimeAddUser_page2;
import POM_pages.actiTimeEnterTimeTrack_page;
import POM_pages.actiTimeEnterTimeTrack_page2;
import POM_pages.actiTimeLogin_page;
import POM_pages.actiTimeLogin_page2;
import POM_pages.actiTimeUserList_page;
import POM_pages.actiTimeUserList_page2;

public class actiTimeAddUser_script2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.actitime.com/login.do");

		actiTimeLogin_page2 ob1 = new actiTimeLogin_page2(driver);
		ob1.login("admin", "manager");
		
		actiTimeEnterTimeTrack_page2 ob2 = new actiTimeEnterTimeTrack_page2(driver);
		ob2.clickUsers();

		actiTimeUserList_page2 ob3 = new actiTimeUserList_page2(driver);
	    ob3.clickNewUser();

		Thread.sleep(3000);

		actiTimeAddUser_page2 ob4 = new actiTimeAddUser_page2(driver);
		ob4.addUser("abhi", "d", "abhid123@gmail.com");
			}

}
