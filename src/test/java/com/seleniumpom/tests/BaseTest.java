package com.seleniumpom.tests;

import com.seleniumpom.seleniumcore.DriverManager;
import com.seleniumpom.seleniumcore.DriverManagerFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    DriverManager driverManager;

    public void init(String browser, int waitTime) {
        driverManager = DriverManagerFactory.getDriverManager(browser);
        driver = driverManager.getWebDriver();
        driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
    }

    public void quitBrowser() {
        driverManager.quitWebDriver();
    }
}
