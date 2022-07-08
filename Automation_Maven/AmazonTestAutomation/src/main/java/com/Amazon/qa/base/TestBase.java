package com.Amazon.qa.base;

import com.Amazon.qa.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;

    public TestBase(){
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("C:\\Users\\Ishani\\IdeaProjects\\" +
                    "FlipkartTestAutomation\\src\\main\\java\\com\\fk\\qa\\config\\configs.properties");
            prop.load(ip);
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialization() {
        String browserName = prop.getProperty("browser");
        if(browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Ishani\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();

            driver.get(prop.getProperty("url"));
            driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

            Actions action = new Actions(driver);
            action.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).click().build().perform();

        }
    }


}
