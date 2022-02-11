package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import utilities.ReusableMethods;

public class TC25_VerifyScrollUpUsingArrow_Hulya {
    /**
     * 1. Launch browser
     * 2. Navigate to url 'http://automationexercise.com'
     * 3. Verify that home page is visible successfully
     * 4. Scroll down page to bottom
     * 5. Verify 'SUBSCRIPTION' is visible
     * 6. Click on arrow at bottom right side to move upward
     * 7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
     */

    MainPage mainPage;
 @Test
    public void verifyScrollUpUsingArrowTest(){

     mainPage=new MainPage();
     // 1. Launch browser
     // 2. Navigate to url 'http://automationexercise.com'
     MainPage.setUp();

     //3. Verify that home page is visible successfully
     Assert.assertTrue(mainPage.AutomationExerciseImg.isDisplayed());

     //4. Scroll down page to bottom
     ReusableMethods.scrollDown(500000);

     //5. Verify 'SUBSCRIPTION' is visible
     Assert.assertTrue(mainPage.subscriptionBtn.isDisplayed());

     //6. Click on arrow at bottom right side to move upward
     mainPage.arrowBtn.click();

     //7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
     Assert.assertTrue(mainPage.fullFledged.isDisplayed());





 }


}
