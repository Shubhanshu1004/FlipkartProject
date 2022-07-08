package com.Amazon.qa.testCases;

import com.Amazon.qa.base.TestBase;
import com.Amazon.qa.pages.HomePage;
import com.Amazon.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;

    //Before using initialization(), we must call TestBase class constructor.
    //Otherwise it will show NullPointerException.
    public LoginPageTest() {
        //To call TestBase class constructor. To initialize all the properties.
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
    }

    @Test(priority = 1)
    public void loginPageTitleTest() {
        String title = loginPage.validateLoginPageTitle();
        Assert.assertEquals(title,"Amazon Sign In");
    }

    @Test(priority = 2)
    public void logoImageTest() {
        boolean flag = loginPage.validateLogo();
        Assert.assertTrue(flag);
    }

    @Test(priority = 3)
    public void loginTest() {
        //login method returns HomePage class object.
        homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();

    }


}
