package com.Amazon.qa.pages;

import com.Amazon.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(xpath = "//input[@id='ap_email']")
    WebElement userName;

    @FindBy(xpath = "//input[@class='a-button-input']")
    WebElement loginBtn;

    @FindBy(xpath = "//input[@id='ap_password']")
    WebElement password;

    @FindBy(xpath = "//a[contains(text(),'Create your Amazon account')]")
    WebElement signUpBtn;

    @FindBy(xpath = "//i[@class='a-icon a-icon-logo']")
    WebElement loginPageLogo;

    //Initializing the page objects:
    public LoginPage() {
        PageFactory.initElements(driver,this);
    }

    //Actions:
    public String validateLoginPageTitle() {
        return driver.getTitle();
    }

    public boolean validateLogo() {

        return loginPageLogo.isDisplayed();
    }

    //After login, it moves to Home Page. Home page is the landing page of login page.
    //That is why this method returns the Home page object.
    public HomePage login(String un, String pd) {
        userName.sendKeys(un);
        loginBtn.click();
        password.sendKeys(pd);
        loginBtn.click();

        return new HomePage();
    }

    //After login, it moves to registration page. Registration page is the landing page of login page.
    //That is why this method returns the registration page object.
    public RegistrationPage createNewAccount() {
        signUpBtn.click();
        return new RegistrationPage();
    }


}
