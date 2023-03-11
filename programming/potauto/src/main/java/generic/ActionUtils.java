package generic;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ActionUtils {

	WebDriver driver;

	public ActionUtils(WebDriver driver) {
		this.driver = driver;
	}

	public static String getData(String path, String sn, int r, int c) {
		try {
			FileInputStream f1 = new FileInputStream(path);
			Workbook book = WorkbookFactory.create(f1);
			String d = book.getSheet(sn).getRow(r).getCell(c).getStringCellValue();
			return d;
		} catch (Exception e) {
			return null;
		}
	}

	public void validateTitle(String expTitle) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.titleIs(expTitle));
			System.out.println("title matching");
		} catch (Exception e) {
			System.out.println("title not matching");
			Assert.fail();
		}
	}
	
	public void validateElement(WebElement ele) {
		try {
			WebDriverWait wait= new  WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(ele));
			System.out.println("element found");
		}catch (Exception e) {
			System.out.println("element not found");
			Assert.fail();
		}
	}
	
	public void captureScreenShot(String location) {
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File(location);
		try {
			FileUtils.copyFile(src, dest);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
