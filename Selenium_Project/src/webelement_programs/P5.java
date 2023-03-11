package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5 {

	public static void main(String[] args) throws InterruptedException {
		//sets the path for chromedriver.exe
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				//launches the chrome browser
				ChromeDriver driver =new ChromeDriver();
				//fetches the web app and waits untill it is  loaded
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				WebElement login = driver.findElement(By.name("login"));
				String tn = login.getTagName();
				System.out.println(tn);
				
				String att1 = login.getAttribute("class");
				String att2 = login.getAttribute("data-testid");
				System.out.println(att1);
				System.out.println(att2);
				
				String css1 = login.getCssValue("border-radius");
				String css2 = login.getCssValue("font-size");
				System.out.println(css1);
				System.out.println(css2);
				
				
				


	}

}
