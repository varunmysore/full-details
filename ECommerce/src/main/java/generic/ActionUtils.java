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

public class ActionUtils {
	WebDriver driver;
	
	public ActionUtils(WebDriver driver) {
		this.driver=driver;
	}

	public String getData(String loc, String sn, int r, int c) {
		try {
			FileInputStream f = new FileInputStream(loc);
			Workbook book = WorkbookFactory.create(f);
			String d = book.getSheet(sn).getRow(r).getCell(c).getStringCellValue();
			return d;
		} catch (Exception e) {
			return null;
		}
	
	}
	
	public void validateTitle(String exptitle) {
		try{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleIs(exptitle));
		System.out.println("title matched");
		
	}catch (Exception e) {
		System.out.println("title not matched");
		Assert.fail();
	}
	}
	public void validateElementVisibility(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(element));
			System.out.println("pass:element is visible");
		} catch (Exception e) {
			System.out.println("fail:element is not visible");
			Assert.fail();
		}
	}
	
	public void captureSceenshot(String location) {
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
