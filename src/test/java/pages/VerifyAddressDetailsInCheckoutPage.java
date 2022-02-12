package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VerifyAddressDetailsInCheckoutPage {
    public VerifyAddressDetailsInCheckoutPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//img[@alt=\"Website for automation practice\"]")
    public WebElement logo;

    @FindBy(xpath = "//a[@href=\"/login\"]")
    public WebElement login;

    @FindBy(xpath = "//input[@data-qa=\"signup-name\"]")
    public WebElement userName;

    @FindBy(xpath = "//input[@data-qa=\"signup-email\"]")
    public WebElement signUpEmail;

    @FindBy(xpath = "//button[@data-qa=\"signup-button\"]")
    public WebElement signUpButton;

    @FindBy(xpath = "//label[@for=\"id_gender1\"]")
    public WebElement genderM;

    @FindBy(xpath = "//input[@id=\"password\"]")
    public WebElement passwordInput;


    @FindBy(xpath = "//select[@id=\"days\"]")
    public WebElement dayDOB;

    @FindBy(xpath = "//select[@id=\"months\"]")
    public WebElement monthDOB;

    @FindBy(xpath = "//select[@id=\"years\"]")
    public WebElement yearDOB;

    @FindBy(xpath = "//input[@id=\"newsletter\"]")
    public WebElement newsletter;

    @FindBy(xpath = "//input[@id=\"optin\"]")
    public WebElement specialOffers;

    @FindBy(xpath = "//input[@id=\"first_name\"]")
    public WebElement fistName;

    @FindBy(xpath = "//input[@id=\"last_name\"]")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id=\"company\"]")
    public WebElement company;

    @FindBy(xpath = "//input[@id=\"address1\"]")
    public WebElement address1;

    @FindBy(xpath = "//input[@id=\"address2\"]")
    public WebElement address2;

    @FindBy(xpath = "//select[@id=\"country\"]")
    public WebElement country;

    @FindBy(xpath = "//input[@id=\"state\"]")
    public WebElement state;

    @FindBy(xpath = "//input[@id=\"city\"]")
    public WebElement city;

    @FindBy(xpath = "//input[@id=\"zipcode\"]")
    public WebElement zipcode;

    @FindBy(xpath = "//input[@id=\"mobile_number\"]")
    public WebElement mobileNumber;

    @FindBy(xpath = "//button[@data-qa=\"create-account\"]")
    public WebElement createAccountButton;

    @FindBy(xpath = "//h2[@data-qa=\"account-created\"]")
    public WebElement accountCreatedTitle;

    @FindBy(xpath = "//a[@data-qa=\"continue-button\"]")
    public WebElement continueButton;

    @FindBy(xpath = "//a[contains(text(),'Logged in as')] ")
    public WebElement loginUserName;

    @FindBy(xpath = "(//a[@data-product-id=\"1\"])[1]")
    public WebElement product;

    @FindBy(xpath = "//u[text()=\"View Cart\"]")
    public WebElement viewCart;

    @FindBy(xpath = "//li[contains(text(),'Shopping Cart')]")
    public WebElement cartPage;

//    @FindBy(xpath = "//a[contains(text(),'Proceed To Checkout')]")
    @FindBy(xpath = "//a[contains(@class,\"btn btn-default check_out\")]")
    public WebElement checkOut;

    @FindBy(xpath = "(//li[@class=\"address_address1 address_address2\"])[1]")
    public WebElement dAddressCompanyName;

    @FindBy(xpath = "(//li[@class=\"address_address1 address_address2\"])[2]")
    public WebElement dAddress_1;

    @FindBy(xpath = "(//li[@class=\"address_address1 address_address2\"])[3]")
    public WebElement dAddress_2;

    @FindBy(xpath = "(//li[@class=\"address_city address_state_name address_postcode\"])[1]")
    public WebElement dAddressCityStateZipCode;

    @FindBy(xpath = "(//li[@class=\"address_country_name\"])[1]")
    public WebElement dAddressCountry;

    @FindBy(xpath = "(//li[@class=\"address_phone\"])[1]")
    public WebElement dAddressPhoneNumber;

    @FindBy(xpath = "(//li[@class=\"address_address1 address_address2\"])[4]")
    public WebElement bAddressCompanyName;

    @FindBy(xpath = "(//li[@class=\"address_address1 address_address2\"])[5]")
    public WebElement bAddress_1;

    @FindBy(xpath = "(//li[@class=\"address_address1 address_address2\"])[6]")
    public WebElement bAddress_2;

    @FindBy(xpath = "(//li[@class=\"address_city address_state_name address_postcode\"])[1]")
    public WebElement bAddressCityStateZipCode;

    @FindBy(xpath = "(//li[@class=\"address_country_name\"])[1]")
    public WebElement bAddressCountry;

    @FindBy(xpath = "(//li[@class=\"address_phone\"])[1]")
    public WebElement bAddressPhoneNumber;

    @FindBy(xpath = "//a[@href=\"/delete_account\"]")
    public WebElement deleteAccountButton;






























    @FindBy(xpath = "//input[@data-qa=\"login-email\"]")
    public WebElement loginEmail;






}
