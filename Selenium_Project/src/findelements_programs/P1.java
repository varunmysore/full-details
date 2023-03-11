package findelements_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	public static void main(String[] args) {
		//sets the path for chromedriver.exe
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				//launches the chrome browser
				ChromeDriver driver =new ChromeDriver();
				//fetches the web app and waits untill it is  loaded
				driver.get("file:///C:/Users/User/Desktop/selenium1.html");
				//identifies  the link
				WebElement link = driver.findElement(By.id("i1"));
				//retrieves text from web element
				String text = link.getText();
				//prints the text//
				System.out.println(text);

	}

}
