package pgManagerPOMpages;

import org.openqa.selenium.WebDriver;

public class InitialisePage {

	public LoginPage LP;
	public HomePage HP;
	public MenuPage MP;
	public SetupPage SP;
	public AddroomDetailsPage ARD;
	public RoomDetailsPage RD;

	public InitialisePage(WebDriver driver) {
		LP = new LoginPage(driver);
		HP = new HomePage(driver);
		MP = new MenuPage(driver);
		SP = new SetupPage(driver);
		ARD = new AddroomDetailsPage(driver);
		RD = new RoomDetailsPage(driver);
	}
}
