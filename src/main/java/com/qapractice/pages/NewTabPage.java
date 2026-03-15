package com.qapractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;
import java.util.Set;

/**
 * NewTabPage class handles operations related to new tab scenarios.
 */
public class NewTabPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public NewTabPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    /**
     * Switch to the new tab opened by the action.
     */
    public void switchToNewTab() {
        String originalWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(originalWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    }

    /**
     * Close the current tab and switch back to the original tab.
     */
    public void closeCurrentTabAndSwitchBack() {
        String originalWindow = driver.getWindowHandle();
        driver.close();
        driver.switchTo().window(originalWindow);
    }
}