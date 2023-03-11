package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demoToursLogin_page {
	
	@FindBy(name="userName")
	public WebElement tbUsername;
	
	@FindBy(name="password")
	public WebElement tbPassword;

	@FindBy(name="submit")
	public WebElement btnSubmit;
	
	public  demoToursLogin_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


}
