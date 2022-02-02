package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RecommendedItemsPage {

    public RecommendedItemsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='recommended_items']")
    public WebElement recommendedItems;

    @FindBy(xpath = "(//a[@data-product-id=\"4\"])[3]")
    public WebElement rItem1;

    @FindBy(xpath = "(//a[@href=\"/view_cart\"])[2]")
    public WebElement cart;

    @FindBy(xpath = "//img[@src=\"get_product_picture/4\"]")
    public WebElement itemInCart;


}
