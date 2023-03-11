package select_programs;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P5 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement day = driver.findElement(By.id("day"));
		Select s1 = new Select(day);
		s1.selectByValue("2");
		
		WebElement month = driver.findElement(By.id("month"));
		Select s2 = new Select(month);
		s2.selectByValue("8");
		
		WebElement year = driver.findElement(By.id("year"));
		Select s3 = new Select(year);
		s3.selectByValue("1993");
	}
}
