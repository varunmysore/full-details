package pgManagerPOMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddroomDetailsPage {
	@FindBy(id = "roomFloorNumber")
	private WebElement tbfloornumber;
	
	@FindBy(id="roomRoomNumber")
	private WebElement tbRoomnumber;
	
	@FindBy(id="roomBedNumber")
	private WebElement tbBednumber;
	
	@FindBy(id="roomRoomSharing")
	private WebElement tbRoomSharing;
	
	@FindBy(id="roomPrice")
	private WebElement tbRoomPrice;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement btnSave;
	
	public void roomDetails(int fn,int rm,int bn,int rs,int price) {
		this.tbfloornumber.sendKeys(""+fn);
		this.tbRoomnumber.sendKeys(""+rm);
		this.tbBednumber.sendKeys(""+bn);
		this.tbRoomSharing.sendKeys(""+rs);
		this.tbRoomPrice.sendKeys(""+price);
		this.btnSave.click();
	
	}
	
	public AddroomDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
