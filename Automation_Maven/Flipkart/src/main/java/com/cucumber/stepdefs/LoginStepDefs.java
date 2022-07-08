package com.cucumber.stepdefs;

import com.cucumber.base.BaseClass;
import com.cucumber.pages.LoginPage;
import io.cucumber.java.en.Given;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoginStepDefs extends BaseClass {
    String url = null;
    LoginPage page;

    public LoginStepDefs() {
        super();
        this.page = new LoginPage();
    }

    @Given("user wants to login")
    public void userWantsToLogin() throws IOException, InterruptedException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Ishani\\Desktop\\Automation_Maven\\Flipkart\\src\\testData.properties");
        Properties prop = new Properties();
        prop.load(fis);
        url = prop.getProperty("url");
        Thread.sleep(20000);
        driver.get(url);
        Thread.sleep(20000);
        LoginPage.loginLink.click();


    }
}
