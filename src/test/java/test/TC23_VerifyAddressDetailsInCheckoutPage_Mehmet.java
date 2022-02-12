package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerifyAddressDetailsInCheckoutPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.concurrent.TimeUnit;

public class TC23_VerifyAddressDetailsInCheckoutPage_Mehmet {
    VerifyAddressDetailsInCheckoutPage verifyAddressDetailsInCheckoutPage = new VerifyAddressDetailsInCheckoutPage();

    /*  Test Case 23: Verify address details in checkout page
        1. Launch browser
        2. Navigate to url 'http://automationexercise.com'
        3. Verify that home page is visible successfully
        4. Click 'Signup / Login' button
        5. Fill all details in Signup and create account
        6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
        7. Verify ' Logged in as username' at top
        8. Add products to cart
        9. Click 'Cart' button
        10. Verify that cart page is displayed
        11. Click Proceed To Checkout
        12. Verify that the delivery address is same address filled at the time registration of account
        13. Verify that the billing address is same address filled at the time registration of account
        14. Click 'Delete Account' button
        15. Verify 'ACCOUNT DELETED!' and click 'Continue' button*/
    @Test
    public void TC23(){

//    1. Launch browser
//    2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        3. Verify that home page is visible successfully
        Assert.assertEquals(Driver.getDriver().getTitle(), "Automation Exercise");
        Assert.assertTrue(verifyAddressDetailsInCheckoutPage.logo.isDisplayed());
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.automationexercise.com/");

//        4. Click 'Signup / Login' button
        verifyAddressDetailsInCheckoutPage.login.click();

//        5. Fill all details in Signup and create account
        verifyAddressDetailsInCheckoutPage.userName.sendKeys("Ahmet");
        verifyAddressDetailsInCheckoutPage.signUpEmail.sendKeys("aao@gmail.com");
        ReusableMethods.waitFor(2);
        verifyAddressDetailsInCheckoutPage.signUpButton.click();

        ReusableMethods.selectCheckBox(verifyAddressDetailsInCheckoutPage.genderM, true);
        verifyAddressDetailsInCheckoutPage.passwordInput.sendKeys("12345");
        ReusableMethods.selectItemFromDropDownMenu(verifyAddressDetailsInCheckoutPage.dayDOB, "1");
        ReusableMethods.selectItemFromDropDownMenu(verifyAddressDetailsInCheckoutPage.monthDOB,"1");
        ReusableMethods.selectItemFromDropDownMenu(verifyAddressDetailsInCheckoutPage.yearDOB, "2000");
        ReusableMethods.selectCheckBox(verifyAddressDetailsInCheckoutPage.newsletter, true);
        ReusableMethods.selectCheckBox(verifyAddressDetailsInCheckoutPage.specialOffers, true);

        verifyAddressDetailsInCheckoutPage.fistName.sendKeys("Ahmet Ali");
        verifyAddressDetailsInCheckoutPage.lastName.sendKeys("Ozturk");
        verifyAddressDetailsInCheckoutPage.company.sendKeys("OZTURK Company");
        verifyAddressDetailsInCheckoutPage.address1.sendKeys("11 Main Street");
        verifyAddressDetailsInCheckoutPage.address2.sendKeys("Block A");
        ReusableMethods.selectItemFromDropDownMenu(verifyAddressDetailsInCheckoutPage.country, "United States");
        verifyAddressDetailsInCheckoutPage.state.sendKeys("New Jersey");
        verifyAddressDetailsInCheckoutPage.city.sendKeys("Elizabeth");
        verifyAddressDetailsInCheckoutPage.zipcode.sendKeys("70070");
        verifyAddressDetailsInCheckoutPage.mobileNumber.sendKeys("555 555 555");
        ReusableMethods.waitFor(2);
        verifyAddressDetailsInCheckoutPage.createAccountButton.click();

//        6. Verify 'ACCOUNT CREATED!' and click 'Continue' button

        Assert.assertEquals(Driver.getDriver().getTitle(), "Automation Exercise - Account Created");
        Assert.assertEquals(verifyAddressDetailsInCheckoutPage.accountCreatedTitle.getText(), "ACCOUNT CREATED!");
        ReusableMethods.waitFor(2);
        verifyAddressDetailsInCheckoutPage.continueButton.click();
        ReusableMethods.waitFor(2);

//        7. Verify ' Logged in as username' at top
        System.out.println(verifyAddressDetailsInCheckoutPage.loginUserName.getText());
        Assert.assertEquals(verifyAddressDetailsInCheckoutPage.loginUserName.getText(), "Logged in as Ahmet");

//        8. Add products to cart
        verifyAddressDetailsInCheckoutPage.product.click();

//        9. Click 'Cart' button
        verifyAddressDetailsInCheckoutPage.viewCart.click();

//        10. Verify that cart page is displayed
        verifyAddressDetailsInCheckoutPage.cartPage.isDisplayed();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Automation Exercise - Checkout");

//        11. Click Proceed To Checkout
        verifyAddressDetailsInCheckoutPage.checkOut.click();

//        12. Verify that the delivery address is same address filled at the time registration of account
        Assert.assertEquals(verifyAddressDetailsInCheckoutPage.dAddressCompanyName.getText(), "OZTURK Company");
        Assert.assertEquals(verifyAddressDetailsInCheckoutPage.dAddress_1.getText(), "11 Main Street");
        Assert.assertEquals(verifyAddressDetailsInCheckoutPage.dAddress_2.getText(), "Block A");
        Assert.assertEquals(verifyAddressDetailsInCheckoutPage.dAddressCityStateZipCode.getText(), "Elizabeth New Jersey 70070");
        Assert.assertEquals(verifyAddressDetailsInCheckoutPage.dAddressCountry.getText(), "United States");
        Assert.assertEquals(verifyAddressDetailsInCheckoutPage.dAddressPhoneNumber.getText(), "555 555 555");

//        13. Verify that the billing address is same address filled at the time registration of account
        Assert.assertEquals(verifyAddressDetailsInCheckoutPage.bAddressCompanyName.getText(), "OZTURK Company");
        Assert.assertEquals(verifyAddressDetailsInCheckoutPage.bAddress_1.getText(), "11 Main Street");
        Assert.assertEquals(verifyAddressDetailsInCheckoutPage.bAddress_2.getText(), "Block A");
        Assert.assertEquals(verifyAddressDetailsInCheckoutPage.bAddressCityStateZipCode.getText(), "Elizabeth New Jersey 70070");
        Assert.assertEquals(verifyAddressDetailsInCheckoutPage.bAddressCountry.getText(), "United States");
        Assert.assertEquals(verifyAddressDetailsInCheckoutPage.bAddressPhoneNumber.getText(), "555 555 555");

        ReusableMethods.waitFor(2);

//        14. Click 'Delete Account' button
        verifyAddressDetailsInCheckoutPage.deleteAccountButton.click();
        ReusableMethods.waitFor(2);

//        15. Verify 'ACCOUNT DELETED!' and click 'Continue' button

//        !!!! There is a problem on the web site after clicking 'Delete Account' Button.
//        That's why I can not Verify 'ACCOUNT DELETED!' and click 'Continue' button.

    }
}

