package actions_program;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P1 {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.vtiger.com/");
        //identifies resources
	    WebElement resources = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
        //creates objects of Actions class
	    Actions a= new Actions(driver);
	    //mouseover on specified web element
	    a.moveToElement(resources).perform();
	    
	    /*mouseover using robot class*/
	    /* int x=resources.getLocation().getX();
	     int y=resources.getLocation().getY();
	     Robot r=new Robot();
	     r.mouseMove(x, y);*/
	}

}
