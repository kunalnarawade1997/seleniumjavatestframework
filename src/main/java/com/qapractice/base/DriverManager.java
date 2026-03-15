package com.qapractice.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.EdgeDriver;
import org.openqa.selenium.WebDriverException;

public class DriverManager {

    private static WebDriver driver;

    // Method to initialize the driver based on the browser type
    public static void initializeDriver(String browser) {
        try {
            switch (browser.toLowerCase()) {
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    System.setProperty("webdriver.edge.driver", "path/to/edgedriver");
                    driver = new EdgeDriver();
                    break;
                default:
                    throw new WebDriverException("Unsupported browser: " + browser);
            }
        } catch (WebDriverException e) {
            e.printStackTrace();
            throw e;
        }
    }

    // Get the WebDriver instance
    public static WebDriver getDriver() {
        return driver;
    }

    // Quit the driver
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}