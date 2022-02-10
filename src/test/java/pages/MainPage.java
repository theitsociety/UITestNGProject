package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import java.util.concurrent.TimeUnit;

public class MainPage {
    public MainPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
    public static void setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @FindBy(xpath = "//img[@src='/static/images/home/logo.png']")
    public WebElement AutomationExerciseImg;

    @FindBy(xpath = "//a[@href='/products']")
    public WebElement ProductsButton;

    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement mainSignUpLogin;

    @FindBy(xpath = "//a[@href='/view_cart']")
    public WebElement cartButton;

    @FindBy(xpath = "//input[@id='susbscribe_email']")
    public WebElement subscriptionEmail;

    @FindBy(xpath = "//button[@id='subscribe']")
    public WebElement subscribeButton;

    @FindBy(xpath = "//i[@class='fa fa-angle-up']")
    public WebElement arrowBtn;

    @FindBy(xpath = "//*[.='You have been successfully subscribed!']")
    public WebElement successfullySubscribed;

    @FindBy(xpath = "//a[text()=' Signup / Login']")
    public WebElement signupLogin;
    @FindBy(xpath = "//a[text()=' Logged in as ']")
    public WebElement loggedInAs;
    @FindBy(xpath = "//a[text()=' Delete Account']")
    public WebElement delete_Account;
    @FindBy(partialLinkText = "Test Cas")
    public WebElement test_case1;
    @FindBy(xpath = "//img[@alt='Website for automation practice']")
    public WebElement isDispley;

    @FindBy(xpath = "//h2[.='Subscription']")
    public WebElement subscriptionBtn;

    @FindBy(xpath = "//h2[.='Full-Fledged practice website for Automation Engineers']")
    public WebElement fullFledged;




}