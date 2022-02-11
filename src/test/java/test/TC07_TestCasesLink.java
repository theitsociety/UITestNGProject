package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import utilities.Driver;

public class TC07_TestCasesLink {

    MainPage mainPage=new MainPage();

    @Test
    public void testCases() {
      //1. Launch browser
      //2. Navigate to url 'http://automationexercise.com'
        MainPage.setUp();
      //3. Verify that home page is visible successfully

      //4. Click on 'Test Cases' button
        mainPage.testCasesButton.click();
      //5. Verify user is navigated to test cases page successfully
        String testCasesTitle = Driver.getDriver().findElement(By.xpath("//div/div/h2/*[contains(text(), 'Test Cases')]")).getText();
        System.out.println(testCasesTitle);
        String expectedTestCasesTitle="TEST CASES";
        Assert.assertEquals(testCasesTitle,expectedTestCasesTitle);

        String currentURL=Driver.getDriver().getCurrentUrl();
        System.out.println(currentURL);
        String expectedCurrentURL="https://www.automationexercise.com/test_cases";
        Assert.assertEquals(currentURL,expectedCurrentURL);
        //All is done
    }
}
