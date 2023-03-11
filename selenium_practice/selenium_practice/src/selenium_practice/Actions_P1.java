package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_P1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		
		WebElement resource = driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle text-dark'])[4]"));
       Actions a = new Actions(driver);
       a.moveToElement(resource).perform();
	}

}
