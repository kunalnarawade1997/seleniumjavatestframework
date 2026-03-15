package com.qapractice.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        // Setup WebDriver and initialize browser
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("URL_OF_THE_PAGE_WITH_DROPDOWN");
    }

    @Test
    public void testSelectByVisibleText() {
        WebElement dropdownElement = driver.findElement(By.id("id_of_dropdown"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("Option Text");
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), "Option Text");
    }

    @Test
    public void testSelectByValue() {
        WebElement dropdownElement = driver.findElement(By.id("id_of_dropdown"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue("option_value");
        Assert.assertEquals(dropdown.getFirstSelectedOption().getAttribute("value"), "option_value");
    }

    @Test
    public void testSelectByIndex() {
        WebElement dropdownElement = driver.findElement(By.id("id_of_dropdown"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByIndex(1); // Selects the second option
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), "Expected Option Text");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}