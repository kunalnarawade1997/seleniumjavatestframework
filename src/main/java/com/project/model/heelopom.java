package com.project.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class heelopom {
	
	//locator of pahe Hello!
	private WebDriver driver;
	
	// 1. Locators using @FindBy (Encapsulation)
	@FindBy(xpath = "//a[contains (text(), 'Text input']")
	private WebElement Textinput;
	
	private WebElement 
	simplebutton = driver.findElement(By.xpath("//a[contains (text(), 'Simple button']"));
	
	private WebElement
	singlecheckbox = driver.findElement(By.xpath("//a[text(),'Single checkbox']"));
	
	private WebElement 
	textarea = driver.findElement(By.xpath("//a[@href=\"/elements/textarea/single\"]"));
	
	public heelopom(WebDriver driver) {
        this.driver = driver;
        // This line initializes all the @FindBy elements above
        PageFactory.initElements(driver, this);
    }
	
	public void clickonsimplebutton()
	{
		simplebutton.click();
	}
	
	public void clickonsinglecheckbox()
	{
		singlecheckbox.click();
	}
	public void clickontextarea()
	{
		textarea.click();
	}
	
	
	
	
	
}
