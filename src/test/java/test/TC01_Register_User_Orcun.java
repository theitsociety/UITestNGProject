package test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
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
        loginPage.name.sendKeys("Orcun Fazli");
        loginPage.emailAddress.sendKeys("deatly02@gmail.com");
        ReusableMethods.waitFor(1);
        loginPage.signupButton.click();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//b[text()='Enter Account Information']")).isDisplayed());
        signupPage.mr.click();
        signupPage.password.sendKeys("1Q2w3e4r");
        ReusableMethods.selectFromDropDown(signupPage.days, "10");
        ReusableMethods.selectFromDropDown(signupPage.mobile_number, "5");
        ReusableMethods.selectFromDropDown(signupPage.years, "1978");
        if (!signupPage.newsletter.isSelected()) {
            signupPage.newsletter.click();
        }
        if (!signupPage.partner.isSelected()) {
            signupPage.partner.click();
        }
        signupPage.firstName.sendKeys("Orcun");
        signupPage.lastName.sendKeys("Fazli");
        signupPage.company.sendKeys("Kif Group LLC");
        signupPage.address1.sendKeys("8200 Whitefalls Blv.");
        Select country = new Select(signupPage.country);
        country.selectByValue("United States");
        signupPage.state.sendKeys("Florida");
        signupPage.city.sendKeys("Jacksonville");
        signupPage.zipCode.sendKeys("32256");
        signupPage.mobile_number.sendKeys("+1 432 222 33 45");
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
