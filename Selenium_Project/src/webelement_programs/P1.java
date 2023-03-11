package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	public static void main(String[] args) {
		// sets the path for chromedrriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
        //maximizes window//
		driver.manage().window().maximize();
		// fetches the web application and waits until it is loaded
		driver.get("file:///C:/Users/User/Desktop/selenium1.html");
		// identifies WebElement with id attribute = i1/ name attribute=n1/ class attribute=c1//
		//WebElement link = driver.findElement(By.id("i1"));//
		 // WebElement link = driver.findElement(By.name("n1"));
		 // WebElement link = driver.findElement(By.className("c1"));
		 // WebElement link = driver.findElement(By.tagName("a"));
		//WebElement link=driver.findElement(By.linkText("facebooooook"));
		WebElement link=driver.findElement(By.partialLinkText("face"));
		/*
		 * By x=By.id("i1");
		 *  WebElement link=driver.findElement(x);
		 */
		// clicks on WebElement//
		link.click();
	}

}
