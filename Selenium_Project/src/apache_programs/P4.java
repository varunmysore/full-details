package apache_programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_pages.initialisePages;

public class P4 {

	public static String getData(String SN,int r,int c) throws Throwable {
		// reads the data from excel(binary form)and  stores in memory
		FileInputStream f1=new FileInputStream("./data/actidata.xlsm");
		//out of data fetched, creates the workspace
		Workbook book = WorkbookFactory.create(f1);
		//retrieves the data from specified sheet,row and col of the workspace
		String d=book.getSheet(SN).getRow(r).getCell(c).getStringCellValue();
		return d;
		
	}
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.actitime.com/login.do");
		
		initialisePages pages = new initialisePages(driver);
		pages.actiTimeLogin.login(getData("adduser", 1, 0),getData("adduser", 1, 1));
		pages.actiTimeEnter.clickUsers();
		pages.actiTimeUser.clickNewUser();
		Thread.sleep(2000);
		pages.AddUser.addUser(getData("adduser", 1, 2),getData("adduser", 1, 3),getData("adduser",1,4));

	}

}
