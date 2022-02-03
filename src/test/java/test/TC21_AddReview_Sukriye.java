package test;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.Product_details1Page;
import pages.ProductsPage;
import utilities.ConfigReader;
import utilities.JSUtils;

public class TC21_AddReview_Sukriye {
    MainPage mainPage = new MainPage();
    ProductsPage products = new ProductsPage();
    Product_details1Page product_details1Page=new Product_details1Page();
    Faker faker=new Faker();

    @Test
    public void addReviewOnProduct() {

        //Launch browser
        //Navigate to url
        MainPage.setUp();
        //Click on "Products button"
        mainPage.ProductsButton.click();

        //Verify user is navigated to ALL PRODUCTS page successfully
        //Assert.assertTrue(products.AllProductsText.isDisplayed());
        System.out.println("Products page's Title= " + JSUtils.getTitleByJS());//This is for getting Title on the console for verify
        String AllProductPageTitle = JSUtils.getTitleByJS();
        Assert.assertEquals(AllProductPageTitle, "Automation Exercise - All Products", "Title is not true");

        //Click on "View Product" button
        products.ViewProductButton1.click();

        //Verify "Write your Review" is visible
        Assert.assertTrue(product_details1Page.writeYourReview.isDisplayed());

        //Enter name, email and review
        product_details1Page.yourName.sendKeys(faker.name().firstName());
        product_details1Page.emailAddress.sendKeys(faker.internet().emailAddress());
        product_details1Page.addReviewHere.sendKeys(ConfigReader.getProperty("review"));

        //Click "Submit"button
        product_details1Page.submitButton.click();

        //Verify success message "Thank you for your review"
        Assert.assertEquals(product_details1Page.successMessage.getText(),"Thank you for your review.");
    }
}