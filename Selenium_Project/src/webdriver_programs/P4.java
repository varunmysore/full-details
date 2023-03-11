package webdriver_programs;

import org.openqa.selenium.chrome.ChromeDriver;

//program  to demonstrate get current url//
public class P4 {
	public static void main(String[] args) {
		//sets the path for chromedrriver.exe
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//launches the chrome browser
		ChromeDriver driver =new ChromeDriver();
		//fetches the web application and waits until it is  loaded
		driver.get("https://www.facebook.com");
        //retrieves the url of web page
		String loginpageurl = driver.getCurrentUrl();
		System.out.println(loginpageurl);
		
		//validate whether the login page is displayed
		if(loginpageurl.equals("https://www.facebook.com/"))
			System.out.println("facebook login page is displayed");
		else
		 System.out.println("facebook login page not displayed");
	}
}

