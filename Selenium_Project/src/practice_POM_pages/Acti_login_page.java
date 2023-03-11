package practice_POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acti_login_page {
	
	//identifies user name
		@FindBy(name="username")
		private WebElement tbName;
		
		//identifies password
		@FindBy(name="pwd")
		private WebElement tbPassword;
		
		//identifies  login button
		@FindBy(id="loginButton")
		private WebElement btnLogin;
	
	public void Login(String a,String b) {
		this.tbName.sendKeys(a);
		this.tbPassword.sendKeys(b);
		this.btnLogin.click();
	}
	
	public Acti_login_page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
}
