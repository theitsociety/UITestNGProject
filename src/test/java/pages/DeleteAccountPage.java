package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DeleteAccountPage {
    public void DeleteAccountPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//h1[text()='Delete Account']" )
    public WebElement deleteAccount;
    @FindBy(xpath = "//button[text()='Delete']")
    public WebElement deleteButton;
    @FindBy(xpath = "//@[text()='ACCOUNT DELETED!']")
    public WebElement accountDeleted;
}
