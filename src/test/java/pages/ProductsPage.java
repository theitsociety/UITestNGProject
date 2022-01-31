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

    @FindBy(xpath = "//a[@href='/product_details/1']")
    public WebElement ViewProductButton1;
}
