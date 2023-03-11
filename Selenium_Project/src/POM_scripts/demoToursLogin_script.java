package POM_scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.demoToursLogin_page;

public class demoToursLogin_script {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		
		demoToursLogin_page ob=new demoToursLogin_page(driver);
				ob.tbUsername.sendKeys("admin");
				ob.tbPassword.sendKeys("manager");
				ob.btnSubmit.click();

	}

}
