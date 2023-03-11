package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("facebook");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.name("login")).click();
	}

}
