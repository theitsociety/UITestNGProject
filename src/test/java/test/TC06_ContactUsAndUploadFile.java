package test;

import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.MainPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC06_ContactUsAndUploadFile {

    MainPage mainPage=new MainPage();
    ContactUsPage contactUsPage=new ContactUsPage();
    Faker faker=new Faker();

    @Test
    public void contactUs() throws InterruptedException {
        // 1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        MainPage.setUp();
        //3. Verify that home page is visible successfully
        Assert.assertTrue(mainPage.AutomationExerciseImg.isDisplayed());
        //4. Click on 'Contact Us' button
        mainPage.contactUsButton.click();
        //5. Verify 'GET IN TOUCH' is visible
        String actualText=contactUsPage.getInTouch.getText();
        System.out.println(actualText);
        String expectedText="GET IN TOUCH";
        Assert.assertEquals(actualText,expectedText);
        //6. Enter name, email, subject and message
        contactUsPage.contactName.sendKeys(faker.name().firstName());
        contactUsPage.contactEmail.sendKeys(faker.internet().emailAddress());
        contactUsPage.contactSubject.sendKeys(faker.commerce().department());
        contactUsPage.contactMessage.sendKeys("I want to get an appointment with this department");
        //7. Upload file
        contactUsPage.chooseFileToUpload.sendKeys("C:/Users/abdas/Desktop/Tables");
        //8. Click 'Submit' button
        contactUsPage.submitButton.click();
        //9. Click OK button
        ReusableMethods.waitFor(1);
        Alert alert= Driver.getDriver().switchTo().alert();
       alert.accept();

        String expectedSubmitMessage="Success! Your details have been submitted successfully.";
        String actualSubmitMessage=contactUsPage.successMessage.getText();
        System.out.println(actualSubmitMessage);
        Assert.assertEquals(actualSubmitMessage,expectedSubmitMessage);
        //11. Click 'Home' button and verify that landed to home page successfully
        contactUsPage.homeButton.click();
        Assert.assertTrue(mainPage.AutomationExerciseImg.isDisplayed());
    }
}
