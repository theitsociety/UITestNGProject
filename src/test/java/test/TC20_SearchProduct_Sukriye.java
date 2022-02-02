package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.ProductsPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Objects;

public class TC20_SearchProduct_Sukriye {
    MainPage mainPage = new MainPage();
    ProductsPage products = new ProductsPage();


    @Test
    public void searchProductVerifyCart(){
        //Launch browser
        //Navigate to url
        MainPage.setUp();
        //Click on "Products button"
        mainPage.ProductsButton.click();

        //Verify user is navigated to ALL PRODUCTS page successfully
        //Assert.assertTrue(products.AllProductsText.isDisplayed());
        System.out.println("Products page's Title= "+ JSUtils.getTitleByJS());//This is for getting Title on the console for verify
        String AllProductPageTitle = JSUtils.getTitleByJS();
        Assert.assertEquals(AllProductPageTitle,"Automation Exercise - All Products","Title is not true");

        //Enter product name in search input and click search button
        products.SearchProductInput.sendKeys("Top For Women");
        products.SearchProductButton.click();

         //Verify "SEARCH PRODUCTS" is visible
        String str = products.SearchProducts.getText();
        Assert.assertEquals(str,"SEARCHED PRODUCTS","searched products is not visible");

         //Verify all the products related to search are visible
        products.SearchProductInput.clear();
        products.SearchProductInput.sendKeys("Tshirt");
        products.SearchProductButton.click();
        ReusableMethods.waitFor(3);
        int products= Driver.getDriver().findElements(By.xpath("//*[text()[contains(.,'Tshirt')]]")).size();
        System.out.println(products);
        Assert.assertEquals(5,products);

        //Add those products to cart


    //Click "Cart" button and verify that products are visible in cart
    //Click "Signup/Login" button and submit login details
    //Again, go to Cart page
    //Verify that those products are visible in cart after login as well




    }
}
