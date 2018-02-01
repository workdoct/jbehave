package page;



import org.junit.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.freecrm.com")
//@DefaultUrl("https://time.epam.com")
public class loginPage extends PageObject{

	public loginPage() {
		super();
	}

	@FindBy(name="username")
	protected WebElementFacade userName;

	@FindBy(name="password")
	protected WebElementFacade password;

	@FindBy(xpath="//input[@value='Login']")
	protected WebElementFacade loginBtn;


	public void luanchApplication() {
		open();
		waitABit(5000);
	}

	public void setUsername(String username) {
		this.userName.waitUntilVisible();
		this.userName.clear();
		this.userName.type(username);
	}

	public void setPassword(String strPassword) {
		this.password.waitUntilVisible();
		this.password.clear();
		this.password.type(strPassword);
	}


	public void clickLoginButton() {
		loginBtn.waitUntilVisible();
		loginBtn.submit();
	}

	public void verifyHomePageTitle() {
		Assert.assertTrue(getTitle().equalsIgnoreCase("CRMPRO"));
	}



}
