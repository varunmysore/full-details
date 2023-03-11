package actions_program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("file:///C:/Users/User/Desktop/doubleclick.html");
        //identifies text
	    WebElement text = driver.findElement(By.id("demo"));
	   //creates object of action class
	    Actions a=new Actions(driver);
	   //double click on specifies web element
	    a.doubleClick(text).perform();
       

	}

}
