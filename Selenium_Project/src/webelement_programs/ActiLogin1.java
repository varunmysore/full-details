package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiLogin1 {

	public static void main(String[] args) {
		// sets the path for chromedrriver.exe
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				// launches the chrome browser
				WebDriver driver = new ChromeDriver();
				// maximizes window//
				driver.manage().window().maximize();
				// fetches the web application and waits until it is loaded
				driver.get("https://demo.actitime.com/login.do");
				//identifies username and enters data
				driver.findElement(By.name("username")).sendKeys("admin");
				//identifies password and enters data
				driver.findElement(By.name("pwd")).sendKeys("manager");
				//identifies login button and click
				driver.findElement(By.id("loginButton")).click();

	}

}
