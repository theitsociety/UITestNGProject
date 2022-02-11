package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RecommendedItemsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.util.concurrent.TimeUnit;

public class TC22_AddRecommendedItemsToCart_Mehmet {

    RecommendedItemsPage rPages = new RecommendedItemsPage();

    /*  1. Launch browser
        2. Navigate to url 'http://automationexercise.com'
        3. Scroll to bottom of page
        4. Verify 'RECOMMENDED ITEMS' are visible
        5. Click on 'Add To Cart' on Recommended product
        6. Click on 'View Cart' button
        7. Verify that product is displayed in cart page
    */

    @Test
    public void VerifyAllProducts() {
//        1-2
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        3-
        ReusableMethods.waitFor(2);
        JSUtils.scrollIntoViewJS(rPages.recommendedItems);
//        4-5
        ReusableMethods.waitFor(2);
        Assert.assertTrue(rPages.recommendedItems.isDisplayed());
        rPages.rItem1.click();
//        6-
        ReusableMethods.waitFor(2);
        rPages.cart.click();
//        7-
        ReusableMethods.waitFor(2);
        Assert.assertTrue(rPages.itemInCart.isDisplayed());


        
    }
}
