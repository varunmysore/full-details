package practice_POM_scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");;
		driver.findElement(By.name("pwd")).sendKeys("manager");;
		driver.findElement(By.id("loginButton")).click();
}
}