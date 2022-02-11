package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC03_LoginUserWithIncorrectData_Emrah {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void TC03(){

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

//        6. Enter incorrect email address and password
        loginPage.email.sendKeys("reppa@gg.com");
        loginPage.password.sendKeys("reppa234");
        ReusableMethods.waitFor(2);

//        7. Click 'login' button
        loginPage.login.click();

//        8. Verify error 'Your email or password is incorrect!' is visible
        System.out.println(loginPage.incorrect.getText());
        Assert.assertTrue(loginPage.incorrect.isDisplayed());
        String actualR=loginPage.incorrect.getText();
        Assert.assertTrue(actualR.contains("Your email or password is incorrect!"));



    }
}
