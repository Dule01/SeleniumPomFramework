package com.seleniumpom.seleniumcore;

//import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
//import io.github.bonigarcia.wdm.managers.EdgeDriverManager;
//import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;

public class DriverManagerFactory {
    public static DriverManager getDriverManager(String browser) {
        DriverManager driverManager;

        switch (browser) {

            case "CHROME": {
                driverManager = new ChromeDriverManager();
            }
            break;
            case "FIREFOX": {
                driverManager = new FirefoxDriverManager();
            }
            break;
            case "EDGE": {
                driverManager = new EdgeDriverManager();
            }
            break;
            default:
                driverManager = new ChromeDriverManager();
        }
        return driverManager;
    }
}
