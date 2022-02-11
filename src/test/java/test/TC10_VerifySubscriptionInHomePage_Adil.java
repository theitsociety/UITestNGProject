package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import static org.testng.Assert.assertTrue;

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

    @Test
    public void TC10_TC001() {

        mainPage = new MainPage();

        //Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));

        //Verify that home page is visible successfully
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Automation Exercise";
        Assert.assertEquals(actualTitle, expectedTitle);


        //Scroll down to footer
        JSUtils.scrollIntoViewJS(mainPage.subscriptionEmail);//Scroll into view with JS
        ReusableMethods.waitFor(2);

        //Verify text 'SUBSCRIPTION'
        Assert.assertTrue(mainPage.subscriptionEmail.isDisplayed());


        //Enter email address in input and click arrow button
        mainPage.subscriptionEmail.sendKeys("alican@gmail.com");
        mainPage.subscribeButton.click();

        //Verify success message 'You have been successfully subscribed!' is visible
        ReusableMethods.waitFor(1);
        assertTrue(mainPage.successfullySubscribed.isDisplayed());

    }
}
