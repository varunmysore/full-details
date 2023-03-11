package pgManagerPOMscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pgManagerPOMpages.InitialisePage;

public class Addrooms {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://iqbetspro.com/pg_manager_new/");
		
		InitialisePage pages = new InitialisePage(driver);
		pages.LP.clickLogin("koduri.bhagath@gmail.com", "123");
		Thread.sleep(2000);
		pages.HP.clickHome();
		
		pages.MP.clickSetup();
		pages.SP.clickSetup();
		pages.RD.clickAddroom();
		pages.ARD.roomDetails(1, 101, 1, 2, 9000);
	}
}
