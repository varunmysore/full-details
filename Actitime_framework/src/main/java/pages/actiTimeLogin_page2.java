package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actiTimeLogin_page2 {
	
	//identifies user name
	@FindBy(name="username")
	private WebElement tbUsername;
	
	//identifies password
	@FindBy(name="pwd")
	private WebElement tbPassword;
	
	//identifies  login button
	@FindBy(id="loginButton")
	private WebElement btnLogin;
	
	public void setUsername(String un) {
		this.tbUsername.sendKeys(un);
	}
	
	public void setPassword(String pw) {
		this.tbPassword.sendKeys(pw);
	}
	
	public void clicklogin() {
		this.btnLogin.click();
	}
	
	public void login(String un,String pw) {
		this.tbUsername.sendKeys(un);
		this.tbPassword.sendKeys(pw);
		this.btnLogin.click();
	}
	
	public actiTimeLogin_page2(WebDriver driver) {
		//initializes web elements(stores reference in variable)
		PageFactory.initElements(driver, this);
		
	}
	
}
