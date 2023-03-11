package screenshot_program;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4 {

	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String title = driver.getTitle();
		System.out.println(title);
		
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/"+title+".png");
		FileUtils.copyFile(src, dest);
		

	}

}
