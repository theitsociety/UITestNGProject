package test;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.testng.Assert.assertTrue;

public class TC05_RegisterUser_Mustafa {

    MainPage mainPage;
    LoginPage loginPage;

    @Test(priority = 1)
    public void TC05_TC001() {

        mainPage = new MainPage();
        loginPage = new LoginPage();

        //Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));

       //Verify that home page is visible successfully
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Automation Exercise";
        Assert.assertEquals(actualTitle,expectedTitle);

       //Click on 'Signup / Login' button
        mainPage.mainSignUpLogin.click();

       //Verify 'New User Signup!' is visible
        ReusableMethods.waitFor(1);
        assertTrue(loginPage.newUserSignup.isDisplayed());

       //Enter name and already registered email address
        loginPage.signUpName.sendKeys("alican");
        loginPage.signUpemail.sendKeys("alican@gmail.com");

       //Click 'Signup' button
        loginPage.signUpButton.click();

       //Verify error 'Email Address already exist!' is visible
        ReusableMethods.waitFor(1);
        assertTrue(loginPage.emailExist.isDisplayed());
    }
}