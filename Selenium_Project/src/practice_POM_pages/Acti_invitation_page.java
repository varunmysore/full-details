package practice_POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acti_invitation_page {
	@FindBy(className = "inputFieldWithPlaceholder lastNameCell")
	private WebElement tbFirstName;

	@FindBy(className = "inputFieldWithPlaceholder lastNameCell")
	private WebElement tbLastName;

	@FindBy(className = "inputFieldWithPlaceholder emailCell")
	private WebElement tbEmail;

	@FindBy(className = "beigeButton withIcon commitBtn useNativeActive")
	private WebElement btnSendInvitn;

	public void SendInvitations(String p,String q,String r) {
		this.tbFirstName.sendKeys(p);
		this.tbLastName.sendKeys(q);
		this.tbEmail.sendKeys(r);
		this.btnSendInvitn.click();
	}

	public Acti_invitation_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
