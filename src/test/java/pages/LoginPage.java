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


}
