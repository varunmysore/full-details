package testng_programs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM_pages.initialisePages;

public class P15 {
	
	@Test(dataProviderClass=Actitimedata.class,dataProvider="newuser")
	public void adduserScript(String un,String pw,String fn,String ln,String em) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.actitime.com/login.do");
		
		initialisePages pages = new initialisePages(driver);
		pages.actiTimeLogin.login(un,pw);
		pages.actiTimeEnter.clickUsers();
		pages.actiTimeUser.clickNewUser();
		Thread.sleep(2000);
		pages.AddUser.addUser(fn,ln,em);
		driver.close();
	}

}
