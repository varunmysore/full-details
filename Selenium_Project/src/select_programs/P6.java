package select_programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P6 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/User/Desktop/selenium7.html");
		WebElement listbox = driver.findElement(By.id("KB"));
		Select s = new Select(listbox);
		s.selectByIndex(3);
		s.selectByValue("T");
		s.selectByVisibleText("lolipop");

		List<WebElement> names = s.getOptions();
		for (WebElement nm : names) {
			boolean mark = nm.isSelected();
			if (mark == false) {
				System.out.println(nm.getText());
			}

		}
	}
}