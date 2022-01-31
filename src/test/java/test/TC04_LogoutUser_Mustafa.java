package test;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import static org.testng.Assert.assertTrue;

public class TC04_LogoutUser_Mustafa {
    MainPage mainPage;
    LoginPage loginPage;

    @Test(priority = 1)
    public void TC04_TC001() {

        mainPage= new MainPage();
        loginPage= new LoginPage();

        //Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));

        //Verify that home page is visible successfully
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Automation Exercise";
        Assert.assertEquals(actualTitle,expectedTitle);

        //Click on 'Signup / Login' button
        mainPage.mainSignUpLogin.click();

        //Verify 'Login to your account' is visible
        ReusableMethods.waitFor(1);
        assertTrue(loginPage.loginAccount.isDisplayed());

        //Enter correct email address and password
        loginPage.email.sendKeys("alican@gmail.com");
        loginPage.password.sendKeys("alican");

        // Click 'login' button
        loginPage.login.click();

        //Verify that 'Logged in as username' is visible
        ReusableMethods.waitFor(1);
        assertTrue(loginPage.loggedUser.isDisplayed());

        //Click 'Logout' button
        loginPage.logOut.click();

        //Verify that user is navigated to login page
         actualTitle = Driver.getDriver().getTitle();
         expectedTitle = "Automation Exercise - Signup / Login";
         Assert.assertEquals(actualTitle,expectedTitle);
    }
}