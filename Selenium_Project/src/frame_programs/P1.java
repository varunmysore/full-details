package frame_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	public static void main(String[] args) {
		// sets the path for chromedrriver.exe
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				// launches the chrome browser
				WebDriver driver = new ChromeDriver();
				// maximizes window//
				driver.manage().window().maximize();
				driver.get("file:///C:/Users/User/Desktop/page2.html");

				driver.findElement(By.id("t2")).sendKeys("selenium");
				//identifies frame
				WebElement fr = driver.findElement(By.id("f1"));
				//switches control to specified  frame
				driver.switchTo().frame(fr);
				driver.findElement(By.id("t1")).sendKeys("java");
	}

}
