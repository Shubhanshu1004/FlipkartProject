package com.cucumber.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public static WebDriver driver;

    public BaseClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ishani\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }
}
