package autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//program to print all auto suggestion
public class Auto_suuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// maximizes window//
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(1000);
		
		
		List<WebElement> autosugg = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
        for(WebElement lv:autosugg)
        {
        	String text = lv.getText();
        	System.out.println(text);
        }

	}

}
