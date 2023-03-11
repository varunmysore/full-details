package webdriver_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//program to demonstrate quit method

public class P12 {

	public static void main(String[] args) throws InterruptedException {
		// sets the path for chromedrriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// maximizes window//
		driver.manage().window().maximize();
		// fetches the web application and waits until it is loaded
		driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");

		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Follow On Twitter")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Like us On Facebook")).click();

		driver.quit();
	}


}
