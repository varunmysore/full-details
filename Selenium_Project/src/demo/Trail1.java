package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trail1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/selenium3.html");
		           //driver.manage().window().fullscreen();
		driver.findElement(By.cssSelector("input[tabindex='1']")).sendKeys("java");
		driver.findElement(By.cssSelector("input[tabindex='2']")).sendKeys("selenium");
		            //driver.findElement(By.name("pass")).sendKeys("12345");
		            //driver.findElement(By.name("login")).click();	
		
	}

}
