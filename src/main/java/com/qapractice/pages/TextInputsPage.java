package com.qapractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextInputsPage {
    private WebDriver driver;

    // Locator for text input fields
    private By textInputField = By.xpath("//input[@type='text']");
    private By textAreaField = By.xpath("//textarea");

    public TextInputsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to enter text into the text input field
    public void enterTextInInputField(String text) {
        WebElement inputField = driver.findElement(textInputField);
        inputField.clear();
        inputField.sendKeys(text);
    }

    // Method to enter text into the text area
    public void enterTextInTextArea(String text) {
        WebElement textArea = driver.findElement(textAreaField);
        textArea.clear();
        textArea.sendKeys(text);
    }

    // Method to get text from the text input field
    public String getTextFromInputField() {
        return driver.findElement(textInputField).getAttribute("value");
    }

    // Method to get text from the text area
    public String getTextFromTextArea() {
        return driver.findElement(textAreaField).getAttribute("value");
    }
}