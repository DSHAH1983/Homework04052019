package com.pageobjectmodel.maven;

import junit.runner.BaseTestRunner;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.pageobjectmodel.maven.Utils.assertTextMessage;

public class HomePage extends Utils
 {
   LoadProp loadprop = new LoadProp();


    private By _homePage = By.xpath("//div[@class='page-body']");
    private By _currency = By.xpath("//select[@id='customerCurrency']");
    private By _apparelPage = By.xpath("//a[@href='/apparel'][1]");
    private By _clothing = By.xpath("//a[@href='/clothing'][1]");

    public void verifyUserOnHomePage() {
        assertURL("https://demo.nopcommerce.com/");
    }

    public void verifyDollarSignDisplayed()
    {
       String browser = loadprop.getProperty("browser");
       webElementDisplayed(_currency);
    }

    public void selectEuroUnderDropDownOnHomePage()
    {
        selectVisibleTextBy(_currency,"Euro");
    }

    public void navigateToClothingInApparelCategoryPage()
    {
       elementAction(_apparelPage,_clothing);
    }
 }