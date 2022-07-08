package TestNG_Sessions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCases {
	
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void test1() {
		System.out.println("Open browser");
		
		// This is Hard Assertion
		// If assertion is getting failed subsequent lines won't be executed
		// Test case will be terminated and will be marked as failed test case
		Assert.assertEquals(true, true);
		
		System.out.println("Enter user name");
		System.out.println("Enter password");
		System.out.println("click on sign in button");
		Assert.assertEquals(true, true);
		
		System.out.println("validate home page");
		
		// This is Soft Assertion
		// If assertion is getting failed subsequent test steps will be executed  
		softAssert.assertEquals(false, true, "home page title is missing");
		
		System.out.println("go to Deals Page");
		System.out.println("create a Deal");
		softAssert.assertEquals(false, true, "Not able to create a deal"); // soft assertion
		
		System.out.println("go to contacts Page");
		System.out.println("cretae a contact");
		softAssert.assertEquals(false, true, "Not able to create a contact"); // soft assertion
		
		// assertAll(): To mark test case as failed, if any soft assertion is getting failed 
		// otherwise test case will be marked as passed
		softAssert.assertAll();
		
	}
	
	@Test
	public void test2() {
		System.out.println("logout");
		softAssert.assertEquals(false, true);
		softAssert.assertAll();
	}

}
