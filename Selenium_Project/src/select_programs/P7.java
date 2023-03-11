package select_programs;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P7 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/User/Desktop/selen_dup.html");
		WebElement listbox = driver.findElement(By.id("KB"));
	
		Select s = new Select(listbox);
		int len = s.getOptions().size();
		s.selectByIndex(len-1);
		
//		Set setName = new HashSet();
//		for(int i=0;i<names.size();i++) {
//			if(setName.add(names.get(i).getText())==true) 
//			setName.add(names.get(i).getText());
//			else
//				System.out.println(names.get(i).getText());}
//	}
}}