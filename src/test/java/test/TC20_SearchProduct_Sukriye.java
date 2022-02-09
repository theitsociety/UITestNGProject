package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.Product_details1Page;
import pages.ProductsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;
import java.util.List;


public class TC20_SearchProduct_Sukriye {
       MainPage mainPage = new MainPage();
       ProductsPage products = new ProductsPage();
       Product_details1Page product_details1Page=new Product_details1Page();
       LoginPage loginPage=new LoginPage();

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
        ReusableMethods.waitFor(2);
        List<WebElement> products= Driver.getDriver().findElements(By.xpath("//div[@class='overlay-content']"));
        System.out.println(products.size());

        for (WebElement item:products){
            Assert.assertTrue(item.isDisplayed());

        }
        //Add those products to cart
        List <WebElement> addCartElements=Driver.getDriver().findElements(By.xpath("//*[@data-product-id]"));
        int expectedProductInTheCard= addCartElements.size()/2;
        System.out.println(expectedProductInTheCard);

        for (int i=0;i<addCartElements.size()/2;i++ ) {
           WebElement each=addCartElements.get(2*i);
           JSUtils.scrollIntoViewJS(each);
           ReusableMethods.waitFor(1);
           each.click();
           product_details1Page.continueShopping.click();
        }
        //Click "Cart" button and verify that products are visible in cart
        mainPage.cartButton.click();
        List<WebElement> rowsInOrderTable=Driver.getDriver().findElements(By.xpath("//tbody//tr"));
        int actualProductInTheCard= rowsInOrderTable.size();
        System.out.println(actualProductInTheCard);
        Assert.assertEquals(actualProductInTheCard,expectedProductInTheCard);

        //Click "Signup/Login" button and submit login details
        mainPage.signupLogin.click();
        loginPage.loginEmailAddress.sendKeys(ConfigReader.getProperty("loginEmail"));
        loginPage.loginPassword.sendKeys(ConfigReader.getProperty("loginPassword"));
        loginPage.loginButton.click();

        //Again, go to Cart page
        mainPage.cartButton.click();

        //Verify that those products are visible in cart after login as well
        List<WebElement> rowsInOrderTableAfterLogin=Driver.getDriver().findElements(By.xpath("//tbody//tr"));
        int actualProductInTheCardAfterLogin= rowsInOrderTableAfterLogin.size();
        System.out.println(actualProductInTheCard);
        Assert.assertEquals(actualProductInTheCardAfterLogin,expectedProductInTheCard);



    }
}
