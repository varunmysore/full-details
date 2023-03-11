package actions_program;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Trial {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.get("file:///C:/Users/User/Desktop/selenium3.html");
	Actions a = new  Actions(driver);
	WebElement ele1 = driver.findElement(By.id("i1"));
	
	a.moveToElement(ele1).click().sendKeys("hai");
	a.keyDown(Keys.CONTROL).sendKeys("a","c");
	a.keyUp(Keys.CONTROL);
	
	a.sendKeys(Keys.TAB);
	a.keyDown(Keys.CONTROL).sendKeys("v");
	a.keyUp(Keys.CONTROL);
	a.build().perform();
}

}
