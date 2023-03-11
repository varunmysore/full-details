package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P7 {

	public static void main(String[] args) {
		// sets the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		ChromeDriver driver = new ChromeDriver();
		// fetches the web app and waits untill it is loaded
		driver.get("https://demo.actitime.com/login.do");
		// driver.manage().window().maximize();

		WebElement textbox = driver.findElement(By.name("username"));
		System.out.println(textbox.isEnabled());

		WebElement cb = driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println(cb.isSelected());
		cb.click();
		System.out.println(cb.isSelected());

	}

}
