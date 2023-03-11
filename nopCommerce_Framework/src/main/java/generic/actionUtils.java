package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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

public class actionUtils {
	WebDriver driver;

	public actionUtils(WebDriver driver) {
		this.driver = driver;
	}

	public static String getData(String excelpath, String sn, int r, int c) {
		try {
			FileInputStream f = new FileInputStream(excelpath);
			Workbook book = WorkbookFactory.create(f);
			String d = book.getSheet(sn).getRow(r).getCell(c).getStringCellValue();
			return d;
		} catch (Exception e) {
			return null;
		}

	}

	public void vaidatetitle(String exptdtitle) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.titleIs(exptdtitle));
			System.out.println("pass");
		} catch (Exception e) {
			System.out.println("fail");
			Assert.fail();
		}
	}

	public void vaidateElement(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(element));
			System.out.println("pass");
		} catch (Exception e) {
			System.out.println("fail");
			Assert.fail();
		}
	}
	
	public void capturescreenshot() {
		TakesScreenshot j = (TakesScreenshot) driver;
		File src = j.getScreenshotAs(OutputType.FILE);
		File dest = new File(Basedata.userDir+"\\screenshots\\scriptName.png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
