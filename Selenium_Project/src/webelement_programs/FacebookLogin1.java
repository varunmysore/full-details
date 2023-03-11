package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin1 {

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
		WebElement username = driver.findElement(By.id("email"));
		//enters data into username
		username.sendKeys("abhi");
		//identifies password using id
		WebElement password = driver.findElement(By.id("pass"));
		//enters data into password
		password.sendKeys("12345");
		//identifies login button using name
		WebElement loginButton = driver.findElement(By.name("login"));
		//clicks on login button
		loginButton.click();

	}

}
