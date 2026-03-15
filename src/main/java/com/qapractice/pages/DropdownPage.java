package com.qapractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
    private WebDriver driver;
    private By dropdownLocator;

    public DropdownPage(WebDriver driver, By dropdownLocator) {
        this.driver = driver;
        this.dropdownLocator = dropdownLocator;
    }

    public void selectByVisibleText(String visibleText) {
        Select dropdown = new Select(driver.findElement(dropdownLocator));
        dropdown.selectByVisibleText(visibleText);
    }

    public void selectByValue(String value) {
        Select dropdown = new Select(driver.findElement(dropdownLocator));
        dropdown.selectByValue(value);
    }

    public void selectByIndex(int index) {
        Select dropdown = new Select(driver.findElement(dropdownLocator));
        dropdown.selectByIndex(index);
    }

    public String getSelectedOption() {
        Select dropdown = new Select(driver.findElement(dropdownLocator));
        return dropdown.getFirstSelectedOption().getText();
    }
}