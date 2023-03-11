package generic;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ActionUtil_fp2 {

	WebDriver driver;

	public ActionUtil_fp2(WebDriver driver) {
		this.driver=driver;
	}

	public static String getData_mtd(String location, String sn, int r, int c) {
		try {
			FileInputStream f = new FileInputStream(location);
			Workbook book = WorkbookFactory.create(f);
			String d = book.getSheet(sn).getRow(r).getCell(c).getStringCellValue();
			return d;
		} catch (Exception e) {
			return null;
		}

	}

	public void validateTitle_mtd(String title) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.titleIs(title));
			System.out.println("pass");
		} catch (TimeoutException e) {
			System.out.println("fail");
			Assert.fail();
		}
	}

	public void validateElement_mtd(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(element));
			System.out.println("pass");
		} catch (TimeoutException e) {
			System.out.println("fail");
			Assert.fail();
		}
	}

	public void captureScreenShot_mtd(String scriptName) {
		
			TakesScreenshot j = (TakesScreenshot) driver;
			File src = j.getScreenshotAs(OutputType.FILE);
			File dest = new File(BaseTest_fp2.userDir+"\\screenshots\\"+scriptName+".png");
			try{FileUtils.copyFile(src, dest);
		} catch (Exception e) {

		}
	}

}