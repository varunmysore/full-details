package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AS3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> autosugg = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		
		for (WebElement lv : autosugg) {
			String text = lv.getText();
			System.out.println(text);
			
			/*if (text.equals("selenium download")) {
				lv.click();
				break;
			}*/
			
			
		}
	}

}
