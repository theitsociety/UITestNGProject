package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PaymentPage {
    public PaymentPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//input[@data-qa=\"name-on-card\"]")
    public WebElement nameOnCard;

    @FindBy(xpath = "//input[@data-qa=\"card-number\"]")
    public WebElement cardNumer;

    @FindBy(xpath = "//input[@data-qa=\"cvc\"]")
    public WebElement cvc;

    @FindBy(xpath = "//input[@data-qa=\"expiry-month\"]")
    public WebElement cardMonth;

    @FindBy(xpath = "//input[@data-qa=\"expiry-year\"]")
    public WebElement expiryYear;

    @FindBy(xpath = "//button[@data-qa=\"pay-button\"]")
    public WebElement payButton;
}
