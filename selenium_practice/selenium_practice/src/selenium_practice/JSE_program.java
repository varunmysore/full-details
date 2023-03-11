package selenium_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE_program {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.actitime.com/");
	    WebElement element = driver.findElement(By.xpath("//div[text()='Start with actiTIME for free']"));
        int x = element.getLocation().getX();
        int y = element.getLocation().getY();
        System.out.println(x+","+y);
        
      JavascriptExecutor j = (JavascriptExecutor) driver;
      j.executeScript("window.scrollBy("+x+","+y+")");
	}

}
