package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class TC16_Place_Order_Orcun {
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();
    ViewCartPage viewCartPage = new ViewCartPage();
    PaymentPage paymentPage = new PaymentPage();


    @Test
    public void TC16(){
        MainPage.setUp();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//img[@src=\"/static/images/home/logo.png\"]")).isDisplayed());
        mainPage.signupLogin.click();
        ReusableMethods.waitFor(1);
        loginPage.loginEmailAddress.sendKeys("deatly02@gmail.com");
        loginPage.loginPassword.sendKeys("1Q2w3e4r");
        loginPage.loginButton.click();
        ReusableMethods.waitFor(1);
        String login = Driver.getDriver().findElement(By.xpath("//a[text()=' Logged in as ']")).getText();
        String actualLogin = "Logged in as " + ConfigReader.getProperty("Login_user_name");
        Assert.assertEquals(actualLogin,login);
        mainPage.ProductsButton.click();
        ReusableMethods.waitFor(1);
        productsPage.Rs400.click();
        productsPage.viewCart.click();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//li[text()='Shopping Cart']")).isDisplayed());
        viewCartPage.proceedToCheckout.click();
        Assert.assertEquals(Driver.getDriver().
                        findElement(By.xpath("//li[@class = \"address_firstname address_lastname\"]")).
                        getText(),
                ConfigReader.getProperty("address_name"));
        Assert.assertEquals(Driver.getDriver().
                        findElement(By.xpath("//li[@class = \"address_address1 address_address2\"][1]")).
                        getText(),
                ConfigReader.getProperty("Login_company"));
        Assert.assertEquals(Driver.getDriver().
                        findElement(By.xpath("//li[@class = \"address_address1 address_address2\"][2]")).
                         getText(),
                ConfigReader.getProperty("Login_address"));
        Assert.assertEquals(Driver.getDriver().
                        findElement(By.xpath("//li[@class=\"address_city address_state_name address_postcode\"]")).
                        getText(),
                ConfigReader.getProperty("address_city"));
        Assert.assertEquals(Driver.getDriver().
                        findElement(By.xpath("//li[@class=\"address_country_name\"][1]")).
                        getText(),
                ConfigReader.getProperty("Login_country"));
        Assert.assertEquals(Driver.getDriver().
                        findElement(By.xpath("//li[@class=\"address_phone\"][1]")).
                        getText(),
                ConfigReader.getProperty("Login_mobile_number"));
        Assert.assertEquals(Driver.getDriver().
                        findElement(By.xpath("//a[text()='Men Tshirt']")).
                        getText(),
                ConfigReader.getProperty("Description"));
        Assert.assertEquals(Driver.getDriver().
                        findElement(By.xpath("//p[text()='Rs. 400']")).getText(), ConfigReader.getProperty("Price"));
        ReusableMethods.waitFor(1);
        viewCartPage.textArea.sendKeys(ConfigReader.getProperty("textArea"));
        ReusableMethods.waitFor(1);
        viewCartPage.proceedToCheckout.click();
        ReusableMethods.waitFor(1);
        paymentPage.nameOnCard.sendKeys(ConfigReader.getProperty("Login_user_name"));
        paymentPage.cardNumer.sendKeys(ConfigReader.getProperty("cardNumber"));
        paymentPage.cvc.sendKeys(ConfigReader.getProperty("cvc"));
        paymentPage.cardMonth.sendKeys(ConfigReader.getProperty("month"));
        paymentPage.expiryYear.sendKeys(ConfigReader.getProperty("cardyear"));
        paymentPage.payButton.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//p[contains(text(),'Congratulations')]")).isDisplayed());
        Driver.closeDriver();








    }
}
