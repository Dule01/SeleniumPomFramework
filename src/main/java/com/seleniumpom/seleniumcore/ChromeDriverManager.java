package com.seleniumpom.seleniumcore;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ChromeDriverManager extends DriverManager {
    @Override
    public void createWebDriver() {
        System.setProperty("webdriver.chrome.driver", "D://SeleniumPomFramework//src//main//resources/chromedriver.exe");
//        driver.manage().window().maximize();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);

    }
}
