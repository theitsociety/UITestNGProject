package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductsPage {
    public ProductsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h2[contains(text(),'Blue Top')]")
    public WebElement ProductName;

    @FindBy(xpath = "//p[contains(text(),'Category')]")
    public WebElement Category;

    @FindBy(xpath = "//span[contains(text(),'Rs. 500')]")
    public WebElement Price;

    @FindBy(xpath = "//b[contains(text(),'Availability:')]")
    public WebElement Availability;

    @FindBy(xpath = "//b[contains(text(),'Condition')]")
    public WebElement Condition;

    @FindBy (xpath = "//b[contains(text(),'Brand')]")
    public WebElement Brand;

    @FindBy (xpath = "//a[text()='Write Your Review'] ")
    public WebElement writeYourReview;

    @FindBy (id="name")
    public WebElement yourName;

    @FindBy (xpath = "//input[@id='email']")
    public WebElement emailAddress;

    @FindBy (xpath = "//textarea[@name='review']")
    public WebElement addReviewHere;

    @FindBy (xpath = "//button[@id='button-review']")
    public WebElement submitButton;

    @FindBy (xpath = "//*[text()[contains(.,'Thank you for your review')]]")
    public WebElement successMessage;

    @FindBy (xpath = "//*[@data-product-id]")
    public WebElement addToCartButton;

    @FindBy (xpath = "//button[text()='Continue Shopping']")
    public  WebElement continueShopping;
    @FindBy(xpath = "//h2[contains(text(),'All Products')]")
    public WebElement AllProductsText;

    @FindBy(xpath = "//img[@src='/get_product_picture/1']")
    public WebElement ProductPicture1;

    @FindBy(xpath = "//img[@src='/get_product_picture/2']")
    public WebElement ProductPicture2;

    @FindBy(xpath = "//a[@href='/product_details/1']")
    public WebElement ViewProductButton1;

    @FindBy(id = "search_product")
    public WebElement SearchProductInput;

    @FindBy(id = "submit_search")
    public WebElement SearchProductButton;

    @FindBy(xpath = "(//p[contains(text(),'Sleeves Printed Top - White')])[1]")
    public WebElement SearchProduct11;

    @FindBy(xpath = "//h2[contains(text(),'Searched Products')]")
    public WebElement SearchProducts;

    @FindBy(xpath = "//a[@data-product-id='1']")
    public WebElement addToCartFirstProduct;

    @FindBy(xpath = "//a[@data-product-id='2']")
    public WebElement addToCartSecondProduct;

    @FindBy(xpath = " //p[@class='text-center']//a")
    public WebElement viewCart;

    @FindBy(xpath = "(//h2[contains(text(), 'Rs. 500')])[1]")
    public WebElement firstProductPrice;

    @FindBy(xpath = "(//h2[contains(text(), 'Rs. 400')])[1]")
    public WebElement secondProductPrice;

    @FindBy(xpath = "//a[ @data-product-id = \"2\"]")
    public WebElement Rs400;
}