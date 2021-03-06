package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[.='Login to your account']")
    public WebElement loginAccount;
    @FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement email;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;
    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement login;
    @FindBy(xpath = "//i[@class='fa fa-user']")
    public WebElement loggedUser;
    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement logOut;
    @FindBy(xpath = "//*[.='New User Signup!']")
    public WebElement newUserSignup;
    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement signUpName;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement signUpemail;
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement signUpButton;
    @FindBy(xpath = "//*[.='Email Address already exist!']")
    public WebElement emailExist;
    @FindBy (xpath = "//input[@name='name']")
    public WebElement name;
    @FindBy (xpath = "//input[@data-qa='signup-email']")
    public WebElement emailAddress;
    @FindBy (xpath = "//button[@data-qa='signup-button']")
    public WebElement signupButton;
    @FindBy(xpath = "//p[text()='Email Address already exist!']")
    public WebElement emailUsedError;
    @FindBy (xpath = "//input[@data-qa='login-email']")
    public WebElement loginEmailAddress;
    @FindBy (xpath = "//input[@data-qa='login-password']")
    public WebElement loginPassword;
    @FindBy (xpath = "//button[@data-qa='login-button']")
    public WebElement loginButton;
    @FindBy(xpath = "//a[@href='/delete_account']")
    public WebElement deleteAccount;
    @FindBy(xpath = "//p[text()='Your email or password is incorrect!']")
    public WebElement incorrect;


}
