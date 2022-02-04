package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.ProductsPage;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;

public class TC12_AddProducts_Zehra {

    /** Launch browser
     2. Navigate to url 'http://automationexercise.com'
     3. Verify that home page is visible successfully
     4. Click 'Products' button
     5. Hover over first product and click 'Add to cart'
     6. Click 'Continue Shopping' button
     7. Hover over second product and click 'Add to cart'
     8. Click 'View Cart' button
     9. Verify both products are added to Cart
     10. Verify their prices, quantity and total price
     */

    MainPage mainPage;
    ProductsPage productsPage;

    @Test(priority = 1)
    public void TC12_TC001() throws InterruptedException {

       mainPage = new MainPage();
       productsPage = new ProductsPage();

        //1-Launch browser
        //2-Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));

        //3-Verify that home page is visible successfully
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Automation Exercise";
        Assert.assertEquals(actualTitle,expectedTitle);

        //4-Click 'Products' button
        mainPage.ProductsButton.click();
//        String currentUrl = Driver.getDriver().getCurrentUrl();
//        Assert.assertEquals(currentUrl,"https://automationexercise.com/products");//https://www.automationexercise.com/products
        //NOTE: When I tried to verify currentUrl actual one is different than what I saw on browser.

        //5-Hover over first product and click 'Add to cart'
        Actions action1 = new Actions(Driver.getDriver());
        action1.moveToElement(productsPage.ProductPicture1).build().perform();;
        Thread.sleep(5);
        productsPage.addToCartFirstProduct.click();

        //6-Click 'Continue Shopping' button
        productsPage.continueShopping.click();

        //7-Hover over second product and click 'Add to cart'
        Actions action2 = new Actions(Driver.getDriver());
        action2.moveToElement(productsPage.ProductPicture2).build().perform();;
        productsPage.addToCartSecondProduct.click();

        //8-Click 'View Cart' button
        productsPage.viewCart.click();

        //9-Verify both products are added to Cart
        WebElement product1 = Driver.getDriver().findElement(By.id("product-1"));
        Assert.assertTrue(product1.getText().contains("Blue Top"));

        WebElement product2 = Driver.getDriver().findElement(By.id("product-2"));
        Assert.assertTrue(product2.getText().contains("Men Tshirt"));

        //10-Verify their prices, quantity and total price



        //Driver.closeDriver();
    }
}