package pompages;

import org.openqa.selenium.WebDriver;

public class initiaizePage {
	public login_page lp;

	public initiaizePage(WebDriver driver) {
		this.lp = new login_page(driver);
	}
}
