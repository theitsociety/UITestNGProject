package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC02_LoginUserWithCorrectData_Emrah {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void TC02(){
        Driver.getDriver().navigate().to("https://automationexercise.com");
        //Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//img[@src='/static/images/home/logo.png']")).isDisplayed());
        mainPage.signupLogin.click();
        ReusableMethods.waitFor(2);
        System.out.println(Driver.getDriver().getCurrentUrl());






    }

}
