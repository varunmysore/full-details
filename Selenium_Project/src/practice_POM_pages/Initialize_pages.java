package practice_POM_pages;

import org.openqa.selenium.WebDriver;

public class Initialize_pages {
	public Acti_enter_page enterpage;
	public Acti_invitation_page invite;
	public Acti_User_page user;
	public Acti_login_page login;
	
	public Initialize_pages(WebDriver driver) {
		this.login=new Acti_login_page(driver);
		this.enterpage=new Acti_enter_page(driver);
		this.user = new Acti_User_page(driver);
		this.invite=new Acti_invitation_page(driver);
		
	}

}
