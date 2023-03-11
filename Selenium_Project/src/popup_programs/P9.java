package popup_programs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//notification and geolocation popup handling
public class P9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// creates an object for chromeoptions
		ChromeOptions options = new ChromeOptions();
	    //disables notification and geolocation
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-geolocation");
		//launches chromebrowser
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// maximizes window//
		driver.manage().window().maximize();
		
		driver.get("https://www.hdfc.com/");
		
		
	}

}
