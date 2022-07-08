package com.Amazon.qa.testCases;

import com.Amazon.qa.base.TestBase;
import com.Amazon.qa.pages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    PaymentsPage paymentsPage;
    CartsPage cartsPage;
    OrdersPage ordersPage;

    //Before using initialization(), we must call TestBase class constructor.
    //Otherwise it will show NullPointerException.
    public HomePageTest() {
        //To call TestBase class constructor. To initialize all the properties.
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        ordersPage = new OrdersPage();
        paymentsPage = new PaymentsPage();
        loginPage = new LoginPage();
        cartsPage = new CartsPage();
        homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
    }

    // Test cases should be independent of each other
    // Before each test case- launch the browser and login
    // @Test- Execute the test case
    // After each test case- close the browser
    @Test(priority = 1)
    public void homePageLogoTest() {
        Assert.assertTrue(homePage.validateHomePageLogo());
    }

    @Test(priority = 2)
    public void verifyPaymentOptionsLink() {

        paymentsPage = homePage.clickOnPaymentOptionsLink();
    }

    @Test(priority = 3)
    public void verifyGoToCartsLink() {

        cartsPage = homePage.clickOnCartsLink();
    }

    @Test(priority = 4)
    public void verifyReturnsAndOrdersLink() {

        ordersPage = homePage.clickOnReturnsAndOrdersLink();
    }

}
