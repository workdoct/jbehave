package flow;

import page.loginPage;

public class LoginFlow {

	loginPage loginPage;
	
	
	public void luanchApplication() {
		loginPage.luanchApplication();
	}
	
	public void setUserName(String strUsername) {
		loginPage.setUsername(strUsername);
	}

	public void setPassword(String strPassword) {
		loginPage.setPassword(strPassword);
	}

	public void clickLoginButton() {
		loginPage.clickLoginButton();
	}
	
	public void verifyHomePageTitle() {
		loginPage.verifyHomePageTitle();
	}
	
}
