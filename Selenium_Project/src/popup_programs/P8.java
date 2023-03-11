package popup_programs;

import java.awt.AWTException;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P8 {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		// sets the path for chromedrriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// maximizes window//
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("register_Layer")).click();
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("D:\\automation\\selenium_workspace\\Selenium_Project\\uploads\\FUpopup.exe");
        	
}
}
