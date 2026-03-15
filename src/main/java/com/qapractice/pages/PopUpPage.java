package com.qapractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopUpPage {
    private WebDriver driver;

    // Define locators for elements in the popup window
    private By popupHeader = By.id("popup-header");
    private By popupMessage = By.id("popup-message");
    private By closeButton = By.id("close-popup");

    // Constructor
    public PopUpPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to get the header of the popup
    public String getPopupHeader() {
        return driver.findElement(popupHeader).getText();
    }

    // Method to get the message in the popup
    public String getPopupMessage() {
        return driver.findElement(popupMessage).getText();
    }

    // Method to close the popup
    public void closePopup() {
        WebElement closeBtn = driver.findElement(closeButton);
        if (closeBtn.isDisplayed()) {
            closeBtn.click();
        }
    }  
}