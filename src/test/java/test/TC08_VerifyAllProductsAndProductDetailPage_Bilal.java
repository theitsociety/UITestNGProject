package test;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.Product_details1Page;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class TC08_VerifyAllProductsAndProductDetailPage_Bilal {
    /**
     1. Launch browser
     2. Navigate to url 'http://automationexercise.com'
     3. Verify that home page is visible successfully
     4. Click on 'ProductsPage' button
     5. Verify user is navigated to ALL PRODUCTS page successfully
     6. The products list is visible
     7. Click on 'View Product' of first product
     8. User is landed to product detail page
     9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
     */
    MainPage mainPage = new MainPage();
    Product_details1Page products = new Product_details1Page();
    Product_details1Page product_details = new Product_details1Page();

    @Test
    public void VerifyAllProducts(){
//        1. Launch browser
//        2. Navigate to url 'http://automationexercise.com'
        MainPage.setUp();
//        3. Verify that home page is visible successfully
        Assert.assertTrue(mainPage.AutomationExerciseImg.isDisplayed());
//        4. Click on 'ProductsPage' button
        mainPage.ProductsButton.click();
//        5. Verify user is navigated to ALL PRODUCTS page successfully
       /** To Check element present:
          if(Driver.getDriver().findElements(By.xpath("//h2[contains(text(),'All Products')]")).size() != 0){
            System.out.println("Element is Present");
        }else{
            System.out.println("Element is Absent");}*/
        /* To Check element present:
        if(products.AllProductsText!=null){
            System.out.println("Element is Present");
        }else{
            System.out.println("Element is Absent");}*/
        /** To Check Text Present
         if(Driver.getDriver().getPageSource().contains("All Products")){
        System.out.println("Text is present");
         }else{
         System.out.println("Text is absent");}*/
        Assert.assertTrue(products.AllProductsText.isDisplayed());
//        6. The products list is visible
        Assert.assertTrue(products.ProductPicture1.isDisplayed());
//        7. Click on 'View Product' of first product
        JSUtils.scrollIntoViewJS(products.ViewProductButton1);//Scroll into view with JS
        ReusableMethods.waitFor(2);//I put extra wait to see from browser
        products.ViewProductButton1.click();
//        8. User is landed to product detail page
        System.out.println("Title Of Product Detail Page = "+JSUtils.getTitleByJS());
        String TitleOfProductDetailPage = JSUtils.getTitleByJS();
        Assert.assertEquals("Automation Exercise - Product Details",TitleOfProductDetailPage);
//        9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
        Assert.assertTrue(product_details.ProductName.isDisplayed());
        Assert.assertTrue(product_details.Category.isDisplayed());
        Assert.assertTrue(product_details.Price.isDisplayed());
        Assert.assertTrue(product_details.Availability.isDisplayed());
        Assert.assertTrue(product_details.Condition.isDisplayed());
        Assert.assertTrue(product_details.Brand.isDisplayed());

//        10.Close the browser
        Driver.closeDriver();
    }


}
