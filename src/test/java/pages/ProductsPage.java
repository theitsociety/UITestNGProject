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

    @FindBy(xpath = "//h2[contains(text(),'Blue Top')]")
    public WebElement firstProductDetail;

    @FindBy(id = "quantity")
    public WebElement quantityInViewProduct;

    @FindBy(xpath = "//*[@id=\"do_action\"]/div[1]/div/div/a")
    public WebElement proceedToCheckout;

    @FindBy(xpath = "(//td[@class='cart_price'])[1]")
    public WebElement firstProductPriceInCart;

    @FindBy(xpath = "(//td[@class='cart_price'])[2]")
    public WebElement secondProductPriceInCart;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement addToCartInViewProduct;

    @FindBy(xpath = "(//button[@class='disabled'])[1]")
    public WebElement quantityInCart;

    @FindBy(xpath = "(//button[@class='disabled'])[2]")
    public WebElement secondProductQuantityInCart;

    @FindBy(xpath = "(//p[@class='cart_total_price'])[1]")
    public WebElement firstProductAmount;

    @FindBy(xpath = "(//p[@class='cart_total_price'])[2]")
    public WebElement secondProductAmount;

    @FindBy(xpath = "(//p[@class='cart_total_price'])[3]")
    public WebElement totalAmount;

    @FindBy(xpath = "//i[@class='fa fa-times']")
    public WebElement removeProduct;

    @FindBy(xpath = "(//a[@data-product-id='1'])[1]")
    public WebElement firstProduct;

    @FindBy(xpath = "//a[.='View Cart']")
    public WebElement viewCartBtn;

    @FindBy(xpath = "//a[.='Register / Login']")
    public WebElement registerLoginBtn;
}
