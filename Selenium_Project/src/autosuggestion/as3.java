package autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class as3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// maximizes window//
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.id("fromCity")).sendKeys("ben");
		Thread.sleep(2000);
		List<WebElement> lists = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']"));
		for (WebElement ele : lists) {
			String text = ele.getText();
			System.out.println(text);
			if (text.contains("Belgrade, Serbia")) {
				ele.click();
				break;
			}
		}
	}
}
