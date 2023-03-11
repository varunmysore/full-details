package webelement_programs;

import org.openqa.selenium.chrome.ChromeDriver;

public class bbc_pgm {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	// launches the chrome browser
	ChromeDriver driver = new ChromeDriver();
	// fetches the web app and waits untill it is loaded
	driver.get("https://bbc.com");
}
}
