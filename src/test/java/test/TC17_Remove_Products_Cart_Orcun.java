package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.ViewCartPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC17_Remove_Products_Cart_Orcun {
        MainPage mainPage = new MainPage();
        ViewCartPage viewCartPage = new ViewCartPage();

    @Test
    public void TC17(){
        MainPage.setUp();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//img[@src=\"/static/images/home/logo.png\"]")).isDisplayed());
        mainPage.frozenTopsForKids.click();
        mainPage.viewCart.click();
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Checkout"));
        viewCartPage.deleteProduct.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//b[text()='Cart is empty!']")).isDisplayed());
        Driver.closeDriver();
    }
}

