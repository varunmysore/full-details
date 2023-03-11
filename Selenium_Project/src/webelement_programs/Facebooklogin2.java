package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin2 {

	public static void main(String[] args) {
		// sets the path for chromedrriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// maximizes window//
		driver.manage().window().maximize();
		// fetches the web application and waits until it is loaded
		driver.get("https://www.facebook.com/");
		// identifies the UserName using id//
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("abhi");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("12345");
		driver.findElement(By.cssSelector("button[name='login']")).click();
	}
}