package test;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.Product_details1Page;
import utilities.ConfigReader;
import utilities.Driver;


public class TC13_VerifyProductQuantity_Zehra {
    Actions actions = new Actions(Driver.getDriver());

    /**
     * 1. Launch browser
     * 2. Navigate to url 'http://automationexercise.com'
     * 3. Verify that home page is visible successfully
     * 4. Click 'View Product' for any product on home page
     * 5. Verify product detail is opened
     * 6. Increase quantity to 4
     * 7. Click 'Add to cart' button
     * 8. Click 'View Cart' button
     */

    MainPage mainPage;
    Product_details1Page productsPage;

    @Test()
    public void TC13_TC001() {
        mainPage = new MainPage();
        productsPage = new Product_details1Page();

        //1-Launch browser
        //2-Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));

        //3-Verify that home page is visible successfully
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Automation Exercise";
        Assert.assertEquals(actualTitle, expectedTitle);

        //4-Click 'View Product' for any product on home page
        productsPage.ViewProductButton1.click();

        //5-Verify product detail is opened
        Assert.assertTrue(productsPage.firstProductDetail.isDisplayed());

        //6-Increase quantity to 4
        productsPage.quantityInViewProduct.clear();
        productsPage.quantityInViewProduct.sendKeys("4");

        //7. Click 'Add to cart' button
        productsPage.addToCartInViewProduct.click();

        //8. Click 'View Cart' button
        productsPage.viewCart.click();

        //9. Verify that product is displayed in cart page with exact quantity
        String quantity1 = productsPage.quantityInCart.getText();
        Assert.assertTrue(quantity1.equals("4"));

    }
}

