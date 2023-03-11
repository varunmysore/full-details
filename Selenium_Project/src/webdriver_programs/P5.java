package webdriver_programs;

import org.openqa.selenium.chrome.ChromeDriver;

//program  to demonstrate manage method//
public class P5 {

	public static void main(String[] args) {
		//sets the path for chromedrriver.exe
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				//launches the chrome browser
				ChromeDriver driver =new ChromeDriver();
				//fetches the web application and waits until it is  loaded
				driver.get("https://www.facebook.com");
				
				//Maximizes/minimize/full screen the window
				//driver.manage().window().maximize();
				//driver.manage().window().minimize();
				driver.manage().window().fullscreen();
	}

}
