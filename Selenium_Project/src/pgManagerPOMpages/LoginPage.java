package pgManagerPOMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(name = "username")
	private WebElement tbUsername;

	@FindBy(name = "password")
	private WebElement tbPassword;

	@FindBy(xpath = "//button")
	private WebElement btnLogin;

	public void clickLogin(String un, String pwd) {
		this.tbUsername.sendKeys(un);
		this.tbPassword.sendKeys(pwd);
		this.btnLogin.click();
	}

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
