package com.dataDrivenTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

public class halfEbayTest extends TestUtil {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ishani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://freecrm.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
	}


	@DataProvider
	public Object[][] getHalfEbayTestData() {
		//		Object[][] excelData = TestUtil.getExcelData("Sheet1");
		Object  [][] excelData = TestUtil.getData("Sheet1");
		return excelData;
	}

	@Test(dataProvider = "getHalfEbayTestData")
	public void halfEbayRegPageTest(String email, String password) {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
