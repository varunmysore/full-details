package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P14 {
	@DataProvider(parallel=true)
	public Object[][] actiLoginData() {
		Object[][] d=new Object [3][2];
		d[0][0]="admin";
		d[0][1]="manager";
		d[1][0]="trainee";
		d[1][1]="trainee";
		d[2][0]="java";
		d[2][1]="selenium";
		return d;
	}
	
	@Test(dataProvider="actiLoginData")
	public void  actiLoginScript(String un,String pw) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// maximizes window//
		driver.manage().window().maximize();
		// fetches the web application and waits until it is loaded
		driver.get("https://demo.actitime.com/login.do");
		// identifies username and enters data
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		// identifies password and enters data
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pw);
		// identifies login button and click
		driver.findElement(By.xpath("//a[@id='loginButton']")).sendKeys(Keys.ENTER);
		driver.close();
	}
}
