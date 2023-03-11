package actions_program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
        //identifies block1
	    WebElement block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
	    WebElement block4 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
        //creates objects of Actions class
	    Actions a= new Actions(driver);
	    //drag and drops the block
	    a.dragAndDrop(block1, block4).perform();
	}

}
