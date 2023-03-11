package pgManagerPOMscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pgManagerPOMpages.LoginPage;

public class LoginScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://iqbetspro.com/pg_manager_new/");

		LoginPage login = new LoginPage(driver);
		login.clickLogin("maha@yahoo.com", "123");

	}

}
