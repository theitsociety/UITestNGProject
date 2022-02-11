package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViewCartPage {
    public  ViewCartPage (){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy (xpath = "//a[@class = \"btn btn-default check_out\"]")
    public WebElement proceedToCheckout;
    @FindBy (xpath = "//textarea[@name=\"message\"]")
    public WebElement textArea;

    @FindBy(xpath = "//a[@class=\"btn btn-default check_out\"]")
    public WebElement placeOrder;

    @FindBy(xpath = "//a[@class='cart_quantity_delete']")
    public WebElement deleteProduct;
}
