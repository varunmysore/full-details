package webdriver_programs;

import org.openqa.selenium.chrome.ChromeDriver;

//program  to demonstrate navigate and getpagesource//
public class P6 {

	public static void main(String[] args) {
		//sets the path for chromedrriver.exe
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//launches the chrome browser
		ChromeDriver driver =new ChromeDriver();
		//fetches the web application and waits until it is  loaded
		driver.get("https://www.instagram.com");
		//navigates to specified url
		driver.navigate().to("https://www.facebook.com");
		//navigate in backward direction
		driver.navigate().back();
		//navigate in forward direction
		driver.navigate().forward();
		//refreshes the web page
		driver.navigate().refresh();
		//returns the front end source code of web page
		String ps=driver.getPageSource();
	    System.out.println(ps);
	}

}
