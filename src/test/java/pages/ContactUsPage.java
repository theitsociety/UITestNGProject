package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactUsPage {

    public ContactUsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[.='Get In Touch']")
    public WebElement getInTouch;

    @FindBy (xpath = "//div/input[@data-qa='name']")
    public WebElement contactName;

    @FindBy (xpath = "//div/input[@data-qa='email']")
    public WebElement contactEmail;

    @FindBy (xpath = "//div/input[@data-qa='subject']")
    public WebElement contactSubject;

    @FindBy (xpath = "//div/textarea[@data-qa='message']")
    public WebElement contactMessage;

    @FindBy (xpath = "//div/input[@name='upload_file']")
    public WebElement chooseFileToUpload;

    @FindBy (xpath = "//div/input[@data-qa='submit-button']")
    public WebElement submitButton;

    @FindBy (xpath = "//div[@class='status alert alert-success']")
    public WebElement successMessage;

    @FindBy (xpath = "//div/a[@class='btn btn-success']")
    public WebElement homeButton;










}
