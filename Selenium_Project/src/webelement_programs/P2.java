package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {

	public static void main(String[] args) {
		// sets the path for chromedrriver.exe
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				// launches the chrome browser
				WebDriver driver = new ChromeDriver();
		        //maximizes window//
				driver.manage().window().maximize();
				// fetches the web application and waits until it is loaded
                driver.get("file:///C:/Users/User/Desktop/selenium2.html");
                //identifies the textbox using id=i1//
                WebElement textbox=driver.findElement(By.id("i1"));
                //enter data into textbox//
                textbox.sendKeys("selenium123$");

	}

}
