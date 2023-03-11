package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demoToursRegister_page {
	@FindBy(name="firstName")
	public WebElement tbFirstname;
	
	@FindBy(name="lastName")
	public WebElement tbLastName;

	@FindBy(name="phone")
	public WebElement tbPhone;
	
	@FindBy(name="userName")
	public WebElement tbEmail;
	
	@FindBy(name="address1")
	public WebElement tbaddress1;

	@FindBy(name="city")
	public WebElement tbCity;
	
	@FindBy(name="state")
	public WebElement tbState;
	
	@FindBy(name="postalCode")
	public WebElement tbPostalCode;

	@FindBy(name="country")
	public WebElement tbCountry;
	
	@FindBy(name="email")
	public WebElement tbUsername;
	
	@FindBy(name="password")
	public WebElement tbPassword;

	@FindBy(name="confirmPassword")
	public WebElement tbConfirmPassword;

	@FindBy(name="submit")
	public WebElement btnSubmit;
	

	
	public  demoToursRegister_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


}
