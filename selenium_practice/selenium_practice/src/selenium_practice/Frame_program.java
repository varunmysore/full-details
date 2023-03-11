package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_program {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/page2.html");
		
		driver.findElement(By.id("t2")).sendKeys("selenium");
		WebElement fr = driver.findElement(By.name("n1"));
		driver.switchTo().frame(fr);
		driver.findElement(By.id("t1")).sendKeys("selenium java");
		driver.findElement(By.id("t1")).clear();
        driver.switchTo().parentFrame();
        driver.findElement(By.id("t2")).clear();

	}

}
