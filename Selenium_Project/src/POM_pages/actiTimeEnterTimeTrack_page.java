package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actiTimeEnterTimeTrack_page {
	
	@FindBy(xpath="//a[@class='content tasks']")
	public  WebElement btnTasks;
	
	@FindBy(xpath="//a[@class='content reports']")
	public WebElement btnReports;
	
	@FindBy(xpath="//a[@class='content users']")
	public WebElement btnUsers;
	
	@FindBy(id="logoutLink")
	public WebElement btnLogoutlink;
	
	public actiTimeEnterTimeTrack_page(WebDriver driver) {
		//initializes webelements
		PageFactory.initElements(driver, this);
	}
	

}
