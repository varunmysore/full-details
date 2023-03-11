package POM_pages;

import org.openqa.selenium.WebDriver;

public class initialisePages {

		public actiTimeLogin_page2 actiTimeLogin;
		public actiTimeEnterTimeTrack_page2 actiTimeEnter;
		public actiTimeUserList_page2  actiTimeUser;
		public actiTimeAddUser_page2 AddUser;
		
		public initialisePages (WebDriver driver) {
			this.actiTimeLogin=new actiTimeLogin_page2(driver);
			this.actiTimeEnter=new  actiTimeEnterTimeTrack_page2(driver);
			this.actiTimeUser=new actiTimeUserList_page2(driver);
			this.AddUser=new actiTimeAddUser_page2(driver);	
		}

	}


