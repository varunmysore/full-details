package webdriver_programs;

import org.openqa.selenium.chrome.ChromeDriver;

//program  to demonstrate get title//
public class P3 {

	public static void main(String[] args) {
				//sets the path for chromedrriver.exe
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				//launches the chrome browser
				ChromeDriver driver =new ChromeDriver();
				//fetches the web application and waits until it is  loaded
				driver.get("https://www.facebook.com");
		        //retrieves the title of web page
				String title = driver.getTitle();
				System.out.println(title);
				
				//validate whether the login page is displayed
				if(title.equals("Facebook – log in or sign up"))
					System.out.println("facebook login page is displayed");
				else
				 System.out.println("facebook login page not displayed");
			}
	}


