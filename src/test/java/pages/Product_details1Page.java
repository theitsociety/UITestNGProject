package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Product_details1Page {
    public Product_details1Page(){
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
}
