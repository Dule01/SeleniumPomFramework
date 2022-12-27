package com.seleniumpom.seleniumcore;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxDriverManager extends DriverManager{
    @Override
    public void createWebDriver() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver(firefoxOptions);
    }
}
