package practice_POM_scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import practice_POM_pages.Initialize_pages;

public class Invitation_scipt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://demo.actitime.com/login.do");
		
		Initialize_pages ob = new Initialize_pages(driver);
		ob.login.Login("admin", "manager");
		ob.enterpage.ClickUsers();
		ob.user.Clickbulk();
		
		Thread.sleep(2000);
		ob.invite.SendInvitations("abhi","das","abhid@gmail.com");

	}

}
