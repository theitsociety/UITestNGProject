package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MainPage;
import pages.ProductsPage;
import utilities.Driver;
import utilities.JSUtils;

import java.util.List;

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
SoftAssert softAssert = new SoftAssert();

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
     System.out.println("Products page's Title= "+JSUtils.getTitleByJS());//This is for getting Title on the console for verify
     String AllProductPageTitle = JSUtils.getTitleByJS();
     Assert.assertEquals(AllProductPageTitle,"Automation Exercise - All Products","Title is not true");
     //Assert.assertTrue(products.AllProductsText.isDisplayed());
//     6. Enter product name in search input and click search button
        products.SearchProductInput.sendKeys("Sleeves Printed Top - White");
        products.SearchProductButton.click();
//     7. Verify 'SEARCHED PRODUCTS' is visible
     String str = products.SearchProducts.getText();
     Assert.assertEquals(str,"SEARCHED PRODUCTS","searched products is not visible");
     //Assert.assertTrue(products.SearchProducts.isDisplayed());
//     8. Verify all the products related to search are visible
     int numberOfImage = Driver.getDriver().findElements(By.xpath("//img")).size();//two image coming like default in this page
     Assert.assertEquals(numberOfImage,3,"related products are not visible");
     softAssert.assertTrue(products.SearchProduct11.isDisplayed());
     softAssert.assertAll();
 }
}
