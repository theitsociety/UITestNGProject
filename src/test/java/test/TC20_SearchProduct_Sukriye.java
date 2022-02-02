package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.ProductsPage;

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
        Assert.assertTrue(products.AllProductsText.isDisplayed());

        //Enter product name in search input and click search button

    //Verify "SEARCH PRODUCTS" is visible
    //Verify all the products related to search are visible
    //Add those products to cart
    //Click "Cart" button and verify that products are visible in cart
    //Click "Signup/Login" button and submit login details
    //Again, go to Cart page
    //Verify that those products are visible in cart after login as well




    }
}
