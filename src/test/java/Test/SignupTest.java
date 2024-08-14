package Test;

import Base.BaseClass;
import Pages.SignupPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignupTest extends BaseClass {

    @Test
    public void testSignup() {
        SignupPage signupPage = new SignupPage(driver);
        signupPage.enterUsername("Saranya Devi");
        signupPage.enterPassword("Saranya@29cse");
        signupPage.clickSignupButton();
        String successMessage = signupPage.getSuccessMessage();
        Assert.assertEquals(successMessage, "Sign up successful");
    }
}
