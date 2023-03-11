package popup_programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P7 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
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
			fileupload("D:\\automation\\selenium_workspace\\Selenium_Project\\uploads\\popup_cv.docx");

	}
	public static void fileupload(String location) throws AWTException {
		
		//writes the content into clipboard
		StringSelection s=new StringSelection(location);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		//creates the object of robot  class
		Robot r= new Robot();
	//press on control+v	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	//release on control+v
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	//press and release of enter
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
		
	}

}
