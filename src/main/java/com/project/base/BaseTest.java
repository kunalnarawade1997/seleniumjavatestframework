package com.project.base;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeTest
	public void openvbrowser() throws InterruptedException
	{
		
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qa-practice.com/");
		
	}
	
	@AfterTest
	public void quitbrowser() 
	{
		driver.quit();
		
		
	}
	
	
	

}
