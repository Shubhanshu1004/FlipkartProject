package com.Amazon.qa.pages;

import com.Amazon.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(xpath = "//a[@id='nav-logo-sprites']")
    WebElement homePageLogo;

    @FindBy(xpath = "//span[@id='nav-cart-count']")
    WebElement goToCartLink;

    @FindBy(xpath = "//a[@id='nav-orders']")
    WebElement returnsAndOrdersLink;

    @FindBy(xpath = "//a[contains(text(),'Amazon Pay')][@class='nav-a  ']")
    WebElement paymentOptionsLink;

    //Initializing the Page objects:
    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    //Actions:
    public String validateHomePageTitle() {
        return driver.getTitle();
    }

    public boolean validateHomePageLogo() {
        return homePageLogo.isDisplayed();
    }

    public PaymentsPage clickOnPaymentOptionsLink() {
        paymentOptionsLink.click();
        return new PaymentsPage();
    }

    public CartsPage clickOnCartsLink() {
        goToCartLink.click();
        return new CartsPage();
    }

    public OrdersPage clickOnReturnsAndOrdersLink() {
        returnsAndOrdersLink.click();
        return new OrdersPage();
    }

}
