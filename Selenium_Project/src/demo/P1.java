package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	   ChromeDriver driver =new ChromeDriver();
	   driver.get("https://www.facebook.com");

	}

}
