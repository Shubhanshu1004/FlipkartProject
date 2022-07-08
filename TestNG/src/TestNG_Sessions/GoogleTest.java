package TestNG_Sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google");
	}
	
	@Test
	public void logoTest() {
		boolean logo = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		System.out.println(logo);
		
		Assert.assertEquals(logo, true, "Logo is not displayed");
	}
	
	@Test
	public void gmailLinkTest() {
		boolean gmailLink = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isDisplayed();
		System.out.println(gmailLink);
		
		Assert.assertEquals(gmailLink, true, "Logo is not displayed");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
