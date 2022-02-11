package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CheckoutPage {
    public CheckoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//li[@class='address_firstname address_lastname'])[1]")
    public WebElement verifyName;

    @FindBy(xpath = "(//li[@class='address_address1 address_address2'])[1]")
    public WebElement verifyAddress1;

    @FindBy(xpath = "(//li[@class='address_address1 address_address2'])[2]")
    public WebElement verifyAddress2;

    @FindBy(xpath = "(//li[@class='address_address1 address_address2'])[3]")
    public WebElement verifyCity;

    @FindBy(xpath = "(//li[@class='address_city address_state_name address_postcode'])[1]")
    public WebElement verifyState;

    @FindBy(xpath = "(//li[@class='address_country_name'])[1]")
    public WebElement verifyCountry;

    @FindBy(xpath = "(//li[@class='address_phone'])[1]")
    public WebElement verifyPhone;

    @FindBy(xpath = "//a[.='Blue Top']")
    public WebElement verifyProduct1;

    @FindBy(xpath = "//textarea[@class='form-control']")
    public WebElement textArea;

    @FindBy(xpath = "//a[.='Place Order']")
    public WebElement placeOrderBtn;
}
