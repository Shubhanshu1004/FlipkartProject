package com.Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Base {
	
	public static WebDriver driver;
	
	public static void initialization() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ishani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
	}
	
	public static void failed() {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(scrFile, new File("C:\\Users\\Ishani\\Desktop\\TestNG\\Screenshots\\google.jpg"));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
