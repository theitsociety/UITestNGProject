package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignupPage {
    public SignupPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//b[text()='Enter Account Information']")
    public WebElement enterAccountInformation;
    @FindBy(xpath = "//input[@value='Mr']")
    public WebElement mr;
    @FindBy(xpath = "//input[@value='Mrs']")
    public WebElement mrs;
    @FindBy(xpath = "//input[@data-qa='name']")
    public WebElement name;
    @FindBy(xpath = "//input[@data-qa='password']")
    public WebElement password;
    @FindBy(xpath = "//select[@data-qa='days']")
    public WebElement days;
    @FindBy(xpath = "//select[@data-qa='months']")
    public WebElement months;
    @FindBy(xpath = "//select[@data-qa='years']")
    public WebElement years;
    @FindBy(xpath = "//input[@name='newsletter']")
    public WebElement newsletter;
    @FindBy(xpath = "//input[@name='optin']")
    public WebElement partner;
    @FindBy(xpath = "//input[@data-qa='first_name']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@data-qa='last_name']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@data-qa=\'company\']")
    public WebElement company;
    @FindBy(xpath = "//input[@data-qa='address']")
    public WebElement address1;
    @FindBy(xpath = "//input[@data-qa='address2']")
    public WebElement address2;
    @FindBy(xpath = "//select[@data-qa='country']")
    public WebElement country;
    @FindBy(xpath = "//input[@data-qa='state']")
    public WebElement state;
    @FindBy(xpath = "//input[@data-qa='city']")
    public WebElement city;
    @FindBy(xpath = "//input[@data-qa='zipcode']")
    public WebElement zipCode;
    @FindBy(xpath = "//input[@data-qa='mobile_number']")
    public WebElement mobile_number;
    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement createAccount;
    @FindBy(xpath = "//a[.='Proceed To Checkout']")
    public WebElement proceedToCheckout;

}
