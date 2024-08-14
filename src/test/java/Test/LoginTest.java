package Test;

import Base.BaseClass;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("Saranya Devi");
        loginPage.enterPassword("Saranya@29cse");
        loginPage.clickLoginButton();
        String successMessage = loginPage.getSuccessMessage();
        Assert.assertEquals(successMessage, "Log in successful");
    }
}
