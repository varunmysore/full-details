package javascript_program;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {

	public static void main(String[] args) throws InterruptedException {
		// sets the path for chromedrriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// maximizes window//
		driver.manage().window().maximize();
		// fetches the web application and waits until it is loaded
		driver.get("https://www.actitime.com/");
		
		Thread.sleep(4000);
		WebElement element = driver.findElement(By.xpath("//div[text()='Start with actiTIME for free']"));
		//retrieves x and  y co-ordinate
		int x=element.getLocation().getX();
		int y = element.getLocation().getY();
		System.out.println(x+","+y);
		
		//typecast the  object from webdriver to JavascriptExecutor
		JavascriptExecutor j = (JavascriptExecutor) driver;
		//scrolls in the webpage
		j.executeScript("window.scrollBy("+x+","+y+")");
	}

}

