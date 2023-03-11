package pgManagerPOMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SetupPage {

	@FindBy(xpath = "//a[@class='btn']")
	private WebElement btnSetUp;

	public void clickSetup() {
		this.btnSetUp.click();
	}

	public SetupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
