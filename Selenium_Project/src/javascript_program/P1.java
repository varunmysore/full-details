package javascript_program;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	public static void main(String[] args) {
		// sets the path for chromedrriver.exe
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				// launches the chrome browser
				WebDriver driver = new ChromeDriver();
				// maximizes window//
				driver.manage().window().maximize();
				// fetches the web application and waits until it is loaded
				driver.get("file:///C:/Users/User/Desktop/selenium8.html");
				//identifies the textbox
				WebElement textbox = driver.findElement(By.id("i1"));
				//checks whether textbox is enabled
				System.out.println(textbox.isEnabled());
				//typecasts the object from webdriver to javascriptexecutor
				JavascriptExecutor j = (JavascriptExecutor) driver;
				//enters data into disabled textboox
				j.executeScript("document.getElementById('i1').value='selenium'");
				System.out.println();



	}

}
