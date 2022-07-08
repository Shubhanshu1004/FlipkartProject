package com.parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// Parameter passing using testng.xml
// 1. How to pass parameter from testng.xml to Test Cases
// 2. What is @Parameter annotation in TestNG
// 3. How to configure testng.xml file with <Parameter> tag
// 4. Run your test cases with testng.xml file

// Data Driven Approach: from different resources
// 1. Excel file --> Test Data
// 2. Properties file --> Environment variables, Test data
// 3. testng.xml file --> Environment variables
// 4. other .xml files
// 5. JSON files
// 6. DB
public class ParameterTest {
	
	WebDriver driver;
	
	@Test
	@Parameters({"browser","url","emailid","password"})
	public void facebookLoginTest(String browser, String url, String emailId, String password) {
		
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ishani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailId);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
}
