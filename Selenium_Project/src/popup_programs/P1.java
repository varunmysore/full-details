package popup_programs;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//confirmation popup program
public class P1 {

	public static void main(String[] args) throws InterruptedException  {
		// sets the path for chromedrriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
	
		// maximizes window//
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// fetches the web application and waits until it is loaded
		driver.get("https://demo.actitime.com/login.do");
		// identifies username and enters data
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		// identifies password and enters data
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		// identifies login button and click
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		
		
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		
		driver.findElement(By.xpath("//div[text()='New User']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[2]")).sendKeys("abhi");
		driver.findElement(By.xpath("//div[@class='closeButton hideButton_panelContainer']")).click();
		//object of WebDriverWait is created
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//waits for JavaScript popup to get loaded
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert jspopup = driver.switchTo().alert();
		String text = jspopup.getText();
		System.out.println(text);
		
		//jspopup.accept();
		jspopup.dismiss();
		

		
	}

}
