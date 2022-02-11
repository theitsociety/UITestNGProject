package test;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.Driver;

public class TC24_DownloadInvoice_Hulya {
    /**
     * 1. Launch browser
     * 2. Navigate to url 'http://automationexercise.com'
     * 3. Verify that home page is visible successfully
     * 4. Add products to cart
     * 5. Click 'Cart' button
     * 6. Verify that cart page is displayed
     * 7. Click Proceed To Checkout
     * 8. Click 'Register / Login' button
     * 9. Fill all details in Signup and create account
     * 10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
     * 11. Verify ' Logged in as username' at top
     * 12.Click 'Cart' button
     * 13. Click 'Proceed To Checkout' button
     * 14. Verify Address Details and Review Your Order
     * 15. Enter description in comment text area and click 'Place Order'
     * 16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
     * 17. Click 'Pay and Confirm Order' button
     * 18. Verify success message 'Your order has been placed successfully!'
     * 19. Click 'Download Invoice' button and verify invoice is downloaded successfully.
     * 20. Click 'Continue' button
     * 21. Click 'Delete Account' button
     * 22. Verify 'ACCOUNT DELETED!' and click 'Continue' button
     */
    MainPage mainPage;
    Product_details1Page productsPage;
    LoginPage loginPage;
    Faker faker;
    SignupPage signupPage;
    AccountCreatedPage accountCreatedPage;
    CheckoutPage checkoutPage;
    PaymentPage paymentPage;
    DeleteAccountPage deleteAccountPage;


@Test

    public void DownloadInvoiceTest(){
   mainPage=new MainPage();
   productsPage=new Product_details1Page();
   loginPage =new LoginPage();
   faker=new Faker();
   signupPage=new SignupPage();
   accountCreatedPage=new AccountCreatedPage();
   checkoutPage=new CheckoutPage();
   paymentPage=new PaymentPage();
   deleteAccountPage=new DeleteAccountPage();

    //    1. Launch browser
    //       2. Navigate to url 'http://automationexercise.com'
    MainPage.setUp();
     // 3. Verify that home page is visible successfully
    Assert.assertTrue(mainPage.AutomationExerciseImg.isDisplayed());

    //4. Add products to cart
    productsPage.firstProduct.click();
    productsPage.viewCartBtn.click();

    //6. Verify that cart page is displayed
    String expected="Automation Exercise - Checkout";
    String actual= Driver.getDriver().getTitle();
    Assert.assertEquals(actual,expected);

    // 7. Click Proceed To Checkout
    productsPage.proceedToCheckout.click();

    //8. Click 'Register / Login' button
    productsPage.registerLoginBtn.click();

    //9. Fill all details in Signup and create account

    loginPage.signUpName.sendKeys(faker.name().fullName());
    loginPage.signUpemail.sendKeys(faker.internet().emailAddress());
    loginPage.signupButton.click();

    signupPage.mr.click();
    signupPage.password.sendKeys(faker.internet().password());
    signupPage.days.sendKeys("2");
    signupPage.months.sendKeys("February");
    signupPage.years.sendKeys("2000");
    signupPage.firstName.sendKeys(faker.name().firstName());
    signupPage.lastName.sendKeys(faker.name().lastName());
    signupPage.company.sendKeys(faker.company().name());
    signupPage.address1.sendKeys(faker.address().streetAddress());
    signupPage.address2.sendKeys(faker.address().streetAddress());
    signupPage.country.sendKeys("United States");
    signupPage.state.sendKeys(faker.address().state());
    signupPage.city.sendKeys(faker.address().city());
    signupPage.zipCode.sendKeys(faker.address().zipCode());
    signupPage.mobile_number.sendKeys(faker.phoneNumber().cellPhone());
    signupPage.createAccount.click();

    //10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
    Assert.assertTrue(accountCreatedPage.accountCreared.isDisplayed());
    accountCreatedPage.continue_button.click();

    //11. Verify ' Logged in as username' at top
    Assert.assertTrue(mainPage.loggedInAs.isDisplayed());

    //12.Click 'Cart' button
    mainPage.cartButton.click();

    //13. Click 'Proceed To Checkout' button
    signupPage.proceedToCheckout.click();

    //14.Verify Address Details and Review Your Order
    Assert.assertTrue(checkoutPage.verifyName.isDisplayed());
    Assert.assertTrue(checkoutPage.verifyAddress1.isDisplayed());
    Assert.assertTrue(checkoutPage.verifyAddress2.isDisplayed());
    Assert.assertTrue(checkoutPage.verifyCity.isDisplayed());
    Assert.assertTrue(checkoutPage.verifyState.isDisplayed());
    Assert.assertTrue(checkoutPage.verifyCountry.isDisplayed());
    Assert.assertTrue(checkoutPage.verifyPhone.isDisplayed());
    Assert.assertTrue(checkoutPage.verifyProduct1.isDisplayed());

    //15. Enter description in comment text area and click 'Place Order'
    checkoutPage.textArea.sendKeys("Good price");
    checkoutPage.placeOrderBtn.click();

    //16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
    paymentPage.nameOnCardField.sendKeys(faker.name().fullName());
    paymentPage.cardNumberField.sendKeys(faker.finance().creditCard());
    paymentPage.cvcField.sendKeys("123");
    paymentPage.expirationField.sendKeys("05/02");
    paymentPage.yearField.sendKeys("2226");

    //17. Click 'Pay and Confirm Order' button
    paymentPage.payAndConfirmOrderBtn.click();

    //18. Verify success message 'Your order has been placed successfully!'

    //19. Click 'Download Invoice' button and verify invoice is downloaded successfully.
    paymentPage.downloadInvoiceBtn.click();
    Assert.assertTrue(paymentPage.downloadInvoiceBtn.isDisplayed());

    //20. Click 'Continue' button
    paymentPage.continueBtn.click();

    //21. Click 'Delete Account' button
    mainPage.delete_Account.click();

    //22. Verify 'ACCOUNT DELETED!' and click 'Continue' button
   // Assert.assertTrue(deleteAccountPage.accountDeleted.isDisplayed());




}
}
