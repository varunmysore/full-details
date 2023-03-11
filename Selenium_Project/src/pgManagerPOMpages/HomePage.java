package pgManagerPOMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(className="openbtn")
	private WebElement btnHome;

	public void clickHome() {
		this.btnHome.click();
	}

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
}
