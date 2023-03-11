package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actiTimeLogin_page {
	
	//identifies user name
	@FindBy(name="username")
	public WebElement tbUsername;
	
	//identifies password
	@FindBy(name="pwd")
	public WebElement tbPassword;
	
	//identifies  login button
	@FindBy(id="loginButton")
	public WebElement btnLogin;
	
	public actiTimeLogin_page(WebDriver driver) {
		//initializes web elements(stores reference in variable)
		PageFactory.initElements(driver, this);
		
	}
	
}
