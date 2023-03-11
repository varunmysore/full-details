package POM_scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import POM_pages.actiTimeLogin_page2;

public class actiLogin_script2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.actitime.com/login.do");
		
		actiTimeLogin_page2 ob=new actiTimeLogin_page2(driver);
		
		ob.login("admin", "manager");
		
		
		/*ob.setUsername("admin");
		ob.setPassword("manager");
		ob.clicklogin();*/
		
			}

}
