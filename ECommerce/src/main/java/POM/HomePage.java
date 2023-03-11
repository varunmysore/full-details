package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//a[text()='Computers ']")
	private WebElement lkcomputer;
	
	@FindBy(xpath="//a[text()='Electronics ']")
	private WebElement lkelectronics;
	
	@FindBy(id="small-searchterms")
	private WebElement tbSearchbox;
	
	public void search() {
		tbSearchbox.sendKeys("samsung");
	}
	public void clickcomputer() {
		lkcomputer.click();
	}
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
