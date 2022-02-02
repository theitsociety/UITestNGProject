package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MainPage;
import pages.ProductsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;

import java.util.List;

public class TC10_VerifySubscriptionInHomePage_Adil {

    /*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Scroll down to footer
5. Verify text 'SUBSCRIPTION'
6. Enter email address in input and click arrow button
7. Verify success message 'You have been successfully subscribed!' is visible
     */

    MainPage mainPage;

    @Test(priority = 1)
    public void TC10_TC001() {

        mainPage = new MainPage();

        //Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));

        //Verify that home page is visible successfully
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Automation Exercise";
        Assert.assertEquals(actualTitle, expectedTitle);


    }
}
