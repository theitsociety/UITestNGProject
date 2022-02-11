package test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC01_Register_User_Orcun {
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    SignupPage signupPage = new SignupPage();
    AccountCreatedPage accountCreatedPage = new AccountCreatedPage();
    DeleteAccountPage deleteAccountPage = new DeleteAccountPage();


    @Test
    public void Test01() {
        Driver.getDriver().navigate().to("https://automationexercise.com/");
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//img[@src=\"/static/images/home/logo.png\"]")).isDisplayed());
        mainPage.signupLogin.click();
        ReusableMethods.waitFor(2);
        Driver.getDriver().get(Driver.getDriver().getCurrentUrl());
        ReusableMethods.waitFor(5);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//h2[text()='New User Signup!']")).isDisplayed());
        loginPage.name.sendKeys(ConfigReader.getProperty("Login_user_name"));
        loginPage.emailAddress.sendKeys(ConfigReader.getProperty("Login_user"));
        ReusableMethods.waitFor(1);
        loginPage.signupButton.click();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//b[text()='Enter Account Information']")).isDisplayed());
        signupPage.mr.click();
        signupPage.password.sendKeys(ConfigReader.getProperty("Login_password"));
        ReusableMethods.selectFromDropDown(signupPage.days, ConfigReader.getProperty("Login_days"));
        ReusableMethods.selectFromDropDown(signupPage.mobile_number, ConfigReader.getProperty("Login_month"));
        ReusableMethods.selectFromDropDown(signupPage.years, ConfigReader.getProperty("Login_year"));
        if (!signupPage.newsletter.isSelected()) {
            signupPage.newsletter.click();
        }
        if (!signupPage.partner.isSelected()) {
            signupPage.partner.click();
        }
        signupPage.firstName.sendKeys(ConfigReader.getProperty("Login_name"));
        signupPage.lastName.sendKeys(ConfigReader.getProperty("Login_lastname"));
        signupPage.company.sendKeys(ConfigReader.getProperty("Login_company"));
        signupPage.address1.sendKeys(ConfigReader.getProperty("Login_address"));
        Select country = new Select(signupPage.country);
        country.selectByValue(ConfigReader.getProperty("Login_country"));
        signupPage.state.sendKeys(ConfigReader.getProperty("Login_state"));
        signupPage.city.sendKeys(ConfigReader.getProperty("Login_city"));
        signupPage.zipCode.sendKeys(ConfigReader.getProperty("Login_zipcode"));
        signupPage.mobile_number.sendKeys(ConfigReader.getProperty("Login_mobile_number"));
        signupPage.createAccount.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//b[text()='Account Created!']")).isDisplayed());
        accountCreatedPage.continue_button.click();
        mainPage.delete_Account.click();
        deleteAccountPage.deleteAccount.click();
        ReusableMethods.waitFor(2);
        deleteAccountPage.deleteButton.click();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//@[text()='ACCOUNT DELETED!']")).isDisplayed());
    }
}
