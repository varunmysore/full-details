package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	@FindBy(name = "Email")
	private WebElement email_tb;

	@FindBy(name = "Password")
	private WebElement password_tb;

	@FindBy(xpath="//button[text()='Log in']")
	private WebElement login_btn;

	public void enterloginDetails(String un, String pwd) {
		this.email_tb.sendKeys(un);
		this.password_tb.sendKeys(pwd);
		this.login_btn.click();
	}

	public login_page(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
}
