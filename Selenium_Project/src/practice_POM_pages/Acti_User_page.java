package practice_POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acti_User_page {
	
	@FindBy(className="components_button_label")
	private WebElement btnBulkInvtn;
	
	public void Clickbulk() {
		this.btnBulkInvtn.click();
	}
	
	public Acti_User_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
