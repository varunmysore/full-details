package practice_POM_scripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	//launches the chrome browser
	ChromeDriver driver =new ChromeDriver();
	//driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement elemnt = driver.findElement(By.xpath("(//img)[1]"));
	String col = elemnt.getCssValue("color");
	System.out.println(col);
	
	elemnt.getSize();
	
/*Set<Cookie> d = driver.manage().getCookies();
String name = d.getClass().getName();
System.out.println(name);*/

Set<String> w = driver.getWindowHandles();
String nm = w.getClass().getName();
System.out.println(nm);
}
}
