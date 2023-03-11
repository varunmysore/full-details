package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4 {

	public static void main(String[] args) throws InterruptedException {
		//sets the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//launches the chrome browser
		ChromeDriver driver =new ChromeDriver();
		//fetches the web app and waits untill it is  loaded
		driver.get("https://www.actitime.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//div[text()='Start with actiTIME for free']"));
		//retrieves x and  y co-ordinate
		int x=element.getLocation().getX();
		int y = element.getLocation().getY();
		System.out.println(x+","+y);

	}

}
