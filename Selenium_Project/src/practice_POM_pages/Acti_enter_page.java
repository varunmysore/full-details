package practice_POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acti_enter_page {

	@FindBy(id = "container_users")
	private WebElement btnUsers;
	
	public void ClickUsers() {
		this.btnUsers.click();
	}
		
	public  Acti_enter_page (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
			
		
		
}
