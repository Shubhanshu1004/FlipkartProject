package com.cucumber.pages;

import com.cucumber.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

    @FindBy(xpath = "//a[text()='Login']")
    public static WebElement loginLink;

    @FindBy(xpath = "//span[text()='Enter Email/Mobile number']/parent::label/parent::div//input")
    public static WebElement username;

    @FindBy(xpath = "//input[@type='password']")
    public static WebElement password;

    @FindBy(xpath = "//span[text()='Login']/parent::button")
    public static WebElement loginButton;

    public LoginPage() {
        super();
        PageFactory.initElements(driver, this);
    }

}
