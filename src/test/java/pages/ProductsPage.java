package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductsPage {
    public ProductsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
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

    @FindBy(xpath = "//button[contains(text(), 'Continue Shopping')]")
    public WebElement continueShopping;

    @FindBy(xpath = " //p[@class='text-center']//a")
    public WebElement viewCart;

    @FindBy(xpath = "(//h2[contains(text(), 'Rs. 500')])[1]")
    public WebElement firstProductPrice;

    @FindBy(xpath = "(//h2[contains(text(), 'Rs. 400')])[1]")
    public WebElement secondProductPrice;







}
