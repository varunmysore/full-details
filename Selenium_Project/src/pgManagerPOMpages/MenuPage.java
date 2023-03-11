package pgManagerPOMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {

	@FindBy(xpath = "(//a)[14]")
	private WebElement btnSetup;

	public void clickSetup() {
		this.btnSetup.click();
	}

	public MenuPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
