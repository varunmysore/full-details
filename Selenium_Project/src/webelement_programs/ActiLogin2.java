package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiLogin2 {

	public static void main(String[] args) throws InterruptedException {
		// sets the path for chromedrriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// maximizes window//
		driver.manage().window().maximize();
		// fetches the web application and waits until it is loaded
		driver.get("https://demo.actitime.com/login.do");
		// identifies username and enters data
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		// identifies password and enters data
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		// identifies login button and click
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		// pauses the execution for 4 secs
		Thread.sleep(4000);

		String expectedLandingPageTitle = "actiTIME - Enter Time-Track";
		String expectedLandingPageUrl = "https://demo.actitime.com/user/submit_tt.do";

		String actualLandingPageTitle = driver.getTitle();
		String actualLandingPageUrl = driver.getCurrentUrl();

		if (expectedLandingPageTitle.equals(actualLandingPageTitle)
				&& expectedLandingPageUrl.equals(actualLandingPageUrl))
			System.out.println("login successfull");
		else
			System.out.println("login unsucessfull");
	}

}
