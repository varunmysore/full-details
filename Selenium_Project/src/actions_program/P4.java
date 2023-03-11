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

public class P4 {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://demo.actitime.com/login.do");
        //identifies text
	    WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
	   //creates object of action class
	    Actions a=new Actions(driver);
	   //double click on specifies web element
	    a.contextClick(link).perform();
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_G);
	    r.keyRelease(KeyEvent.VK_G);
	
	    //g-opens in incognito mode
	    //t-opens in new tab
	    //w-opens in new window
	}

}
