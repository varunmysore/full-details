package select_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P2 {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("file:///C:/Users/User/Desktop/selenium7.html");
    WebElement listbox = driver.findElement(By.id("KB"));
   Select s = new Select(listbox);
   s.selectByIndex(3);
   s.selectByValue("T");
   s.selectByVisibleText("lolipop");
   
   Thread.sleep(3000);
   
  /* s.deselectByIndex(3);
   s.deselectByValue("T");
   s.deselectByVisibleText("lolipop");*/
   
   s.deselectAll();
	}
}
