package findelements_programs;

import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//program to print prices of shoes in sorted order 
public class P6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// maximizes window//
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("woodland shoes");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		Thread.sleep(3000);
		List<WebElement> titles = driver.findElements(By.xpath("//a[@class='IRpwTa']"));
		/*for(WebElement lv:titles)
		{
			String title = lv.getText();
			//System.out.println(title);
		}*/
		List<WebElement> prices = driver.findElements(By.xpath("//a[@class='IRpwTa']/..//div[@class='_30jeq3']"));
		/*for(WebElement lv:prices)
		{
			String price = lv.getText();
			//System.out.println(price);
		}*/
		TreeMap<Integer,String> t = new TreeMap<>();
		
		for(int i=0;i<titles.size();i++)
		{
			String title = titles.get(i).getText();
			String price = prices.get(i).getText();
			int  p=Integer.parseInt(price.substring(1).replace(",", ""));
			t.put(p, title);
		}
		//for(Entry<Integer, String> lv:t.entrySet())
			//System.out.println(lv.getValue()+"="+lv.getKey());
			
		for(Entry<Integer, String> lv:t.entrySet()) {
			System.out.println(lv.getValue()+"="+lv.getKey());
		}
		}
		
	}

