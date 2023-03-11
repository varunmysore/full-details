package popup_programs;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//prompt popup
public class P3 {
	public static void main(String[] args) throws InterruptedException  {
		// sets the path for chromedrriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// maximizes window//
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/User/Desktop/prompt.html");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert jspopup = driver.switchTo().alert();
		jspopup.sendKeys("abhi");
		jspopup.accept();		
		
}
}
