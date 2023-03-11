package webelement_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3 {

	public static void main(String[] args) {
		//sets the path for chromedriver.exe
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				//launches the chrome browser
				ChromeDriver driver =new ChromeDriver();
				//fetches the web app and waits untill it is  loaded
				driver.get("https://demo.actitime.com/login.do");
				//identifies username and password
				WebElement un = driver.findElement(By.name("username"));
				WebElement pw = driver.findElement(By.name("pwd"));
				
				int h1 = un.getSize().getHeight();
				int w1 = un.getSize().getWidth();
				int h2 = pw.getSize().getHeight();
				int w2 = pw.getSize().getWidth();
				
				if(h1==h2 && w1==w2)
					System.out.println("pass:same dimension");
				else
					System.out.println("fail:different dimension");
				

	}

}
