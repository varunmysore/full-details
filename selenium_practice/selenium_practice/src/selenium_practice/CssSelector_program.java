package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_program {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		Thread.sleep(4000);
		
		String actualUrl = "https://demo.actitime.com/user/submit_tt.do";
		String actualtitle= "actiTIME - Enter Time-Track";
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(url);
		
		if(actualtitle.equals(title)) {
			
		}

	}

}
