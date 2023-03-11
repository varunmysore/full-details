package frame_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {

	public static void main(String[] args) {
		// sets the path for chromedrriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// maximizes window//
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/page2.html");

		driver.findElement(By.id("t2")).sendKeys("selenium");
		// switches control to specified frame
		driver.switchTo().frame("n1");
		driver.findElement(By.id("t1")).sendKeys("java");
		driver.findElement(By.id("t1")).clear();
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t2")).clear();
		
		
	}

}
