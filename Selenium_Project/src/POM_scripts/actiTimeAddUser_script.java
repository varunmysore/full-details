package POM_scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.actiTimeAddUser_page;
import POM_pages.actiTimeEnterTimeTrack_page;
import POM_pages.actiTimeLogin_page;
import POM_pages.actiTimeUserList_page;

public class actiTimeAddUser_script {

	public static void main(String[] args) throws InterruptedException {
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
		ob2.btnUsers.click();

		actiTimeUserList_page ob3 = new actiTimeUserList_page(driver);
		ob3.btnNewUser.click();

		Thread.sleep(3000);

		actiTimeAddUser_page ob4 = new actiTimeAddUser_page(driver);
		ob4.tbFirstName.sendKeys("abhi");
		ob4.tbLastName.sendKeys("d");
		ob4.tbEmail.sendKeys("abhid@gamil.com");
		ob4.btnSave.click();

	}

}
