package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "(//a[contains(text(),'Products')])[2]")
	private WebElement btnProducts;

	public void clickProducts() {
		this.btnProducts.click();
	}

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
}
