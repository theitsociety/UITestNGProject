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



}
