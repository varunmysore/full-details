package webdriver_programs;

import org.openqa.selenium.chrome.ChromeDriver;

//program to demonstrate get and close method//
public class P1 {

	public static void main(String[] args) {
		//sets the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//launches the chrome browser
		ChromeDriver driver =new ChromeDriver();
		//fetches the web app and waits untill it is  loaded
		driver.get("https://www.facebook.com");
        //closes the window
		driver.close();
	}

}
