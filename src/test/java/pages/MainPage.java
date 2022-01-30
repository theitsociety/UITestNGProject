package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPage {
    public MainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
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
    }

