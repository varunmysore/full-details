
package screenshot_program;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	public static void main(String[] args) throws IOException {
		// sets the path for chromedrriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// maximizes window//
		driver.manage().window().maximize();
		// fetches the web application and waits until it is loaded
		driver.get("https://www.facebook.com/");
		
		//typecasts object from webdriver to TakesScreenshot
		TakesScreenshot t = (TakesScreenshot) driver;
		//captures the screenshot and  returns it as java file class object
		File src = t.getScreenshotAs(OutputType.FILE);
		//creates an object of java file class which points towards the physical file 
		File dest=new File("./screenshots/p1.png");
		//copies the contents from src to dest which gets written into physical file
		FileUtils.copyFile(src, dest);
		
		
	}

}
