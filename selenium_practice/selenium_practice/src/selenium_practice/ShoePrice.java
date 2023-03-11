package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoePrice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("woodland shoes");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		
		List<WebElement> titles = driver.findElements(By.xpath("//a[@class='IRpwTa']"));
		for(WebElement lv:titles) {
            System.out.println(lv.getText());
		}
		List<WebElement> prices = driver.findElements(By.xpath("//a[@class='IRpwTa']/..//div[@class='_30jeq3']"));
	for(WebElement lv:prices) {
		System.out.println(lv.getText());
	}
		for(int i=0;i<titles.size();i++) {
			String title = titles.get(i).getText();
			String price = prices.get(i).getText();
			System.out.println(title+"="+price);
		}
	}

}
