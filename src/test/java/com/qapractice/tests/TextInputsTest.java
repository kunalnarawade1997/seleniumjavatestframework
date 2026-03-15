package com.qapractice.tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextInputsTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        // Set the path for the WebDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://example.com"); // Change to the URL you want to test
    }

    @Test
    public void testTextInputInteraction() {
        WebElement textInput = driver.findElement(By.id("text-input-id")); // Use the actual ID
        textInput.sendKeys("Sample Text");
        Assertions.assertEquals("Sample Text", textInput.getAttribute("value"));
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
