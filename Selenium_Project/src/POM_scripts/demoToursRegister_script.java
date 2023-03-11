package POM_scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import POM_pages.demoToursRegister_page;

public class demoToursRegister_script {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		
		//WebElement country = driver.findElement(By.name("country"));
		// Select s1 = new Select(country);
		
		demoToursRegister_page ob=new demoToursRegister_page(driver);
		
		ob.tbFirstname.sendKeys("admin");
		ob.tbLastName.sendKeys("manager");
		ob.tbPhone.sendKeys("1234567890");
		ob.tbEmail.sendKeys("admin1234@gmail.com");
		
		ob.tbaddress1.sendKeys("1st cross");
		ob.tbCity.sendKeys("mysore");
		ob.tbState.sendKeys("karnataka");
		ob.tbPostalCode.sendKeys("57022");
		ob.tbCountry.sendKeys("india");
		ob.tbUsername.sendKeys("admin");
		ob.tbPassword.sendKeys("12345");
		ob.tbConfirmPassword.sendKeys("12345");
		
		ob.btnSubmit.click();

	}

}
