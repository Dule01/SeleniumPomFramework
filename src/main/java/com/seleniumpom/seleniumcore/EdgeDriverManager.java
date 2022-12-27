package com.seleniumpom.seleniumcore;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeDriverManager extends DriverManager {
    @Override
    public void createWebDriver() {
        EdgeOptions edgeOptions = new EdgeOptions();
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver(edgeOptions);
    }
}
