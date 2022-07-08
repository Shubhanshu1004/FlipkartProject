package com.Screenshot;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenshotTest extends Base{

	@BeforeMethod
	public void setUp() {
		initialization();
	}
	
	@Test
	public void takeScreeshotTest() {
		Assert.assertEquals(false, true);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
}
