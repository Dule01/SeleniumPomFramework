package com.seleniumpom.pageobjects;

import com.seleniumpom.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends CommonMethods {

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#main_menu_top  .top.menu_specials")
    WebElement topMenuSpecialsBtn;

    public void navigateToSpecials(){
        clickElement(topMenuSpecialsBtn);

        //URL Verification
        String expectedUrl = "https://automationteststore.com/index.php?rt=product/special";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

        //Title verification
        String expectedTitle = "Special Offers";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @FindBy(css = ".menu_home")
    WebElement homePageBtn;

    public void validateHomepageBtn(){
        clickElement(homePageBtn);

        //URL Verification
        String expectedUrl = "https://automationteststore.com/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

        //Title verification
        String expectedTitle = "A place to practice your automation skills!";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @FindBy(css = "#main_menu_top .menu_account")
    WebElement topMenuAccountBtn;

    public void navigateToAccount(){
        clickElement(topMenuAccountBtn);

        //URL Verification
        String expectedUrl = "https://automationteststore.com/index.php?rt=account/login";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

        //Title verification
        String expectedTitle = "Account Login";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @FindBy(css = "#main_menu_top [data-id='menu_cart']")
    WebElement topMenuCartBtn;

    public void navigateToCart(){
        clickElement(topMenuCartBtn);

        //URL Verification
        String expectedUrl = "https://automationteststore.com/index.php?rt=checkout/cart";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

        //Title verification
        String expectedTitle = "Shopping Cart";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @FindBy(css = "#main_menu_top .menu_checkout")
    WebElement topMenuCheckoutBtn;

    public void navigateToCheckout(){
        clickElement(topMenuCheckoutBtn);

        //URL Verification
        String expectedUrl = "https://automationteststore.com/index.php?rt=checkout/cart";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

        //Title verification
        String expectedTitle = "Shopping Cart";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }



}
