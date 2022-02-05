package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC02_LoginUserWithCorrectData_Emrah {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void TC02(){
//        1. Launch browser
//        2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().navigate().to("https://automationexercise.com");

//        3. Verify that home page is visible successfully
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//img[@src='/static/images/home/logo.png']")).isDisplayed());

//        4. Click on 'Signup / Login' button
        mainPage.signupLogin.click();
        ReusableMethods.waitFor(2);

//        5. Verify 'Login to your account' is visible
        System.out.println(Driver.getDriver().getCurrentUrl());
        String exceptedResult="https://automationexercise.com/login";
        String actualResult=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualResult,exceptedResult);

//        6. Enter correct email address and password
        loginPage.email.sendKeys(ConfigReader.getProperty("email_first"));
        loginPage.password.sendKeys(ConfigReader.getProperty("password"));
        ReusableMethods.waitFor(2);

//        7. Click 'login' button
        loginPage.login.click();

//        8. Verify that 'Logged in as username' is visible
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@class=\"fa fa-user\"]")).isDisplayed());

//        9. Click 'Delete Account' button
        loginPage.deleteAccount.click();

//        10. Verify that 'ACCOUNT DELETED!' is visible
        //Note: Account is not deleted. All buttons do not work anymore.









    }

}
