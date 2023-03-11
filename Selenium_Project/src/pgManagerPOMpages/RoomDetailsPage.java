package pgManagerPOMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoomDetailsPage {

	@FindBy(xpath = "//a[@class='btn btn-success pull-right']")
	private WebElement btnAddroom;

	public void clickAddroom() {
		this.btnAddroom.click();
	}

	public RoomDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
