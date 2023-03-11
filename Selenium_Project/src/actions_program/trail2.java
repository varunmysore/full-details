package actions_program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class trail2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/User/Desktop/selenium3.html");
		WebElement ele1 = driver.findElement(By.id("i1"));
		Actions a=new Actions(driver);
		a.moveToElement(ele1).click().sendKeys("hai");
		a.keyDown(Keys.CONTROL).sendKeys("a","c");
		a.keyUp(Keys.CONTROL);
		
		a.sendKeys(Keys.TAB);
		a.keyDown(Keys.CONTROL).sendKeys("V");
		a.keyUp(Keys.CONTROL);
		a.build().perform();
		
		
		

	}

}
