package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actiTimeUserList_page {
	
	@FindBy(xpath="(//div[contains(text(),'Departments')])[1]")
	public WebElement btnDepartments;
	
	@FindBy(xpath="(//div[contains(text(),'New User')])[1]")
	public WebElement btnNewUser;
	
	@FindBy(xpath="(//div[contains(text(),'Bulk Invitations')])[1]")
    public WebElement btnBulkInvitations;
	
	public actiTimeUserList_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
}
