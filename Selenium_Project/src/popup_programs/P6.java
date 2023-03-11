
	package popup_programs;

	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	// program to demonstrate child window PopUp //
	public class P6 {
		public static void main(String[] args) throws InterruptedException {
			// sets the path for chromedrriver.exe
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			// launches the chrome browser
			WebDriver driver = new ChromeDriver();
			// maximizes window//
			driver.manage().window().maximize();
			// fetches the web application and waits until it is loaded
			driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");

			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("Follow On Twitter")).click();
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("Like us On Facebook")).click();

			// returns the reference of main window
			String mainwindow = driver.getWindowHandle();
			// returns the reference of all windows
			Set<String> allwindows = driver.getWindowHandles();

			for (String lv : allwindows) {
				// switches the control to specific window
				driver.switchTo().window(lv);
				// closes the window
				driver.close();
				Thread.sleep(1000);
			}
		}

	}



