package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.ProductsPage;
import utilities.JSUtils;

public class TC09_SearchProduct_Bilal<puclic> {
/**
 1. Launch browser
 2. Navigate to url 'http://automationexercise.com'
 3. Verify that home page is visible successfully
 4. Click on 'Products' button
 5. Verify user is navigated to ALL PRODUCTS page successfully
 6. Enter product name in search input and click search button
 7. Verify 'SEARCHED PRODUCTS' is visible
 8. Verify all the products related to search are visible
 */
MainPage mainPage = new MainPage();
ProductsPage products = new ProductsPage();

 @Test
 public void SearchProduct(){
// 1. Launch browser
// 2. Navigate to url 'http://automationexercise.com'
     MainPage.setUp();
//     3. Verify that home page is visible successfully
     Assert.assertTrue(mainPage.AutomationExerciseImg.isDisplayed());
//     4. Click on 'Products' button
     mainPage.ProductsButton.click();
//     5. Verify user is navigated to ALL PRODUCTS page successfully
     System.out.println("Automation Exercise - All Products = "+JSUtils.getTitleByJS());
     String AllProductPageTitle = JSUtils.getTitleByJS();
     Assert.assertEquals("Automation Exercise - All Products",AllProductPageTitle);
     Assert.assertTrue(products.AllProductsText.isDisplayed());
//     6. Enter product name in search input and click search button

//     7. Verify 'SEARCHED PRODUCTS' is visible
//     8. Verify all the products related to search are visible
    }
}
