package Testpage;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.BaseSetup;
import PageObject.LoginPage;

public class TestLogin extends BaseSetup {
	 WebDriver driver;

	@BeforeClass
	public void setUp()
	{
		driver=getDriver();
		}
	@Test
	public void verifyLoginPage() throws Exception {
		LoginPage login = new LoginPage(driver);
		Thread.sleep(3000);
		login.enteruserName();
		login.enterPassword();
		Thread.sleep(3000);
		login.clickOnLoginIn();
	}

}
	