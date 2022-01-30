package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement newUserSignup;
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
}
