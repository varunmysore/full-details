package findelements_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {

	public static void main(String[] args) {
		//sets the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//launches the chrome browser
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//fetches the web app and waits untill it is  loaded
		driver.get("https://www.facebook.com/");
		//identifies all links in webpage
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		//retrieves size of list
		System.out.println(links.size());
		//return the  type of list
		System.out.println(links.getClass().getName());
		//retrieves text from the links
        for(WebElement lv:links) {
        	System.out.println(lv.getText());
        }
	}

}
