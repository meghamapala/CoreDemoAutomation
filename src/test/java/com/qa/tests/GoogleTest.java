package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@Test
	public void googleTitleTest() {
		System.setProperty("webdriver.chrome.driver", "/Users/meghamapalagama/eclipse-workspace/CoreDemoAutomation/chromedriver 4");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		String title=driver.getTitle();
		System.out.println("Google Title is  :"+title);
		
		Assert.assertEquals(title, "Google");
		
		driver.close();
		
		driver.quit();
		}}
