package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.LoginPage;
import pages.MainPage;
import pages.ProductsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class TC12_AddProducts_Zehra {

    /**
     * Launch browser
     * 2. Navigate to url 'http://automationexercise.com'
     * 3. Verify that home page is visible successfully
     * 4. Click 'Products' button
     * 5. Hover over first product and click 'Add to cart'
     * 6. Click 'Continue Shopping' button
     * 7. Hover over second product and click 'Add to cart'
     * 8. Click 'View Cart' button
     * 9. Verify both products are added to Cart
     * 10. Verify their prices, quantity and total price
     */

    MainPage mainPage = new MainPage();
    ProductsPage productsPage = new ProductsPage();
    LoginPage loginPage;

    @BeforeTest
    public void setUp() {
        loginPage = new LoginPage();
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        mainPage.mainSignUpLogin.click();
        loginPage.email.sendKeys(ConfigReader.getProperty("email_zehra"));
        loginPage.password.sendKeys(ConfigReader.getProperty("password_zehra"));
        loginPage.login.click();
    }

    @Test(priority = 1)
    public void TC12_TC001() {
        //1-Launch browser
        //2-Navigate to url 'http://automationexercise.com'
        //3-Verify that home page is visible successfully
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Automation Exercise";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(priority = 2)
    public void TC12_TC002() {
        //4-Click 'Products' button
        mainPage.ProductsButton.click();

        //5-Hover over first product and click 'Add to cart'
        Actions action1 = new Actions(Driver.getDriver());
        action1.moveToElement(productsPage.ProductPicture1).build().perform();
        action1.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        //Updating first product quantity
       // productsPage.addToCartFirstProduct.click();
        productsPage.ViewProductButton1.click();
        productsPage.quantityInViewProduct.clear();
        productsPage.quantityInViewProduct.sendKeys("4");
        productsPage.addToCartInViewProduct.click();
        //6-Click 'Continue Shopping' button
        productsPage.continueShopping.click();
        mainPage.ProductsButton.click();

        //7-Hover over second product and click 'Add to cart'
        Actions action2 = new Actions(Driver.getDriver());
        action2.moveToElement(productsPage.ProductPicture2).build().perform();
        productsPage.addToCartSecondProduct.click();

        //8-Click 'View Cart' button
        productsPage.viewCart.click();

        //9-Verify both products are added to Cart
        WebElement product1 = Driver.getDriver().findElement(By.id("product-1"));
        Assert.assertTrue(product1.getText().contains("Blue Top"));
        WebElement product2 = Driver.getDriver().findElement(By.id("product-2"));
        Assert.assertTrue(product2.getText().contains("Men Tshirt"));
    }

    @Test(priority = 3)
    public void TC12_TC003() {
        //10-Verify their prices, quantity and total price
        mainPage.ProductsButton.click();
        int blueTopPrice = Integer.parseInt(productsPage.firstProductPrice.getText().replaceAll("[^0-9]", ""));
        int menTshirtPrice = Integer.parseInt(productsPage.secondProductPrice.getText().replaceAll("[^0-9]", ""));
        mainPage.cartButton.click();
        productsPage.proceedToCheckout.click();
        int blueTopCartPrice = Integer.parseInt(productsPage.firstProductPriceInCart.getText().replaceAll("[^0-9]", ""));
        int menTshirtCartPrice = Integer.parseInt(productsPage.secondProductPriceInCart.getText().replaceAll("[^0-9]", ""));
        Assert.assertEquals(blueTopPrice, blueTopCartPrice);
        Assert.assertEquals(menTshirtPrice, menTshirtCartPrice);
        System.out.println("Prices are verified");
    }

    @Test(priority = 4)
    public void TC12_TC004() {
        //Verify product's quantity
        mainPage.cartButton.click();
        productsPage.proceedToCheckout.click();
        String quantity1 = productsPage.quantityInCart.getText();
        Assert.assertTrue(quantity1.equals("4"));
        String quantity2 = productsPage.secondProductQuantityInCart.getText();
        Assert.assertTrue(quantity2.equals("1"));
        // First product total amount
        int blueTopCartPrice = Integer.parseInt(productsPage.firstProductAmount.getText().replaceAll("[^0-9]", ""));
        //Second product total amount
        int menTshirtCartPrice = Integer.parseInt(productsPage.secondProductAmount.getText().replaceAll("[^0-9]", ""));
        //Products total amount
        int total = Integer.parseInt(productsPage.totalAmount.getText().replaceAll("[^0-9]", ""));
        System.out.println(total);
        int sumOfProductPrice = blueTopCartPrice + menTshirtCartPrice;
        mainPage.cartButton.click();
        Assert.assertEquals(total, sumOfProductPrice);
        ReusableMethods.waitFor(2);
        Actions action1 = new Actions(Driver.getDriver());
        action1.moveToElement(productsPage.removeProduct).build().perform();
        productsPage.removeProduct.click();
        ReusableMethods.waitFor(2);
        action1.moveToElement(productsPage.removeProduct).build().perform();
        productsPage.removeProduct.click();


    }

    @AfterTest
    public void tearDown(){
        Driver.closeDriver();
    }
}