package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actiTimeUserList_page2 {
	
	@FindBy(xpath="(//div[contains(text(),'Departments')])[1]")
	private WebElement btnDepartments;
	
	@FindBy(xpath="(//div[contains(text(),'New User')])[1]")
	private WebElement btnNewUser;
	
	@FindBy(xpath="(//div[contains(text(),'Bulk Invitations')])[1]")
    private WebElement btnBulkInvitations;
	
	public void clickDepartments() {
		this.btnDepartments.click();
	}
	
	public void clickNewUser() {
		this.btnNewUser.click();
	}
	
	public void clickBulkinvitation() {
		this.btnBulkInvitations.click();
	}
	
	public actiTimeUserList_page2(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
}
