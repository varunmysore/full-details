package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actiTimeEnterTimeTrack_page2 {
	
	@FindBy(xpath="//a[@class='content tasks']")
	private  WebElement btnTasks;
	
	@FindBy(xpath="//a[@class='content reports']")
	private WebElement btnReports;
	
	@FindBy(xpath="//a[@class='content users']")
	private WebElement btnUsers;
	
	@FindBy(id="logoutLink")
	private WebElement btnLogoutlink;
	
	public void clickTasks() {
		this.btnTasks.click();
	}
	
	public  void clickReports() {
		this.btnReports.click();
	}
	
	public  void clickUsers() {
		this.btnUsers.click();
	}
	
	public void clickLogout() {
		this.btnLogoutlink.click();
	}
	
	public actiTimeEnterTimeTrack_page2(WebDriver driver) {
		//initializes webelements
		PageFactory.initElements(driver, this);
	}
	

}
