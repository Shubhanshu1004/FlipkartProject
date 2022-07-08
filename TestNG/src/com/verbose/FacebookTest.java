package com.verbose;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ishani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
	}
	
	@Test
	public void titleTest1() {
		String title = driver.getTitle();
		System.out.println(title);		
		Assert.assertEquals(title, "Facebook – log in or sign up");
	}
	
	@Test
	public void titleTest2() {
		String title = driver.getTitle();
		System.out.println(title);		
		Assert.assertEquals(title, "Facebook – log in or sign up");
	}
	
	@Test
	public void titleTest3() {
		String title = driver.getTitle();
		System.out.println(title);		
		Assert.assertEquals(title, "Facebook – log in or sign up");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	

}
