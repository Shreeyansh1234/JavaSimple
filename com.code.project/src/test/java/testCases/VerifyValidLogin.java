package testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginSuccessfulPage;
import util.utility;

public class VerifyValidLogin extends BaseTestCase{
	HomePage homePage;
	LoginSuccessfulPage loginSuccessfulPage;

	@Test
	public void verifyValidLogin() throws IOException {

		homePage = new HomePage(driver);
		homePage.getUserNameTextField().sendKeys(utility.readProperty("userName"));
		homePage.getPasswordTextField().sendKeys(utility.readProperty("password"));
		homePage.SubmitBtnClick();
		loginSuccessfulPage = new LoginSuccessfulPage(driver);
		utility.takesSnapshot(driver, "verifyValidLogin"); 
		assertEquals(loginSuccessfulPage.getLoginSuccessFullMsg().getText(), "Login Successfully");
	}

}
