package com.seleniumpom.tests;

import com.seleniumpom.pageobjects.HomePage;
import jdk.jfr.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomePageTc extends BaseTest{

    public void navigateToUrl(){
        String url = "https://automationteststore.com/";
        driver.get(url);
    }


    @BeforeMethod
    @Parameters("browser")
    public void setup(String browser){
        init(browser, 30);
        navigateToUrl();
    }

    @Test(description = "Navigate to the Specials Page")
    @Description("From the Homepage, access the 'Specials' page from the Top Menu")
    public void navigateToSpecials(){
        HomePage hp = new HomePage(driver);
        hp.navigateToSpecials();
    }

    @Test(description = "Validate the functionality of the Homepage button")
    @Description("Validate that the Homepage button navigates the user to the Homepage")
    public void homePageBtnFunctionality(){
        HomePage hp = new HomePage(driver);
        hp.navigateToSpecials();
    }

    @Test(description = "Navigate to the Account page")
    @Description("From the Homepage, access the 'Account' page from the Top Menu")
    public void navigateToAccount(){
        HomePage hp = new HomePage(driver);
        hp.navigateToAccount();
    }

    @Test(description = "Navigate to the Cart page")
    @Description("From the Homepage, access the 'Cart' page from the Top Menu")
    public void navigateToCart(){
        HomePage hp = new HomePage(driver);
        hp.navigateToCart();
    }


    @AfterMethod
    public void tearDown(){
        quitBrowser();
    }
}
