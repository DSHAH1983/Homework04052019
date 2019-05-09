package com.pageobjectmodel.maven;

import org.openqa.selenium.By;

public class LowToHigh extends Utils
{
    LoadProp loadprop = new LoadProp();
    private By _priceSortedBy = By.cssSelector("[class='prices']");



public void userShouldBeOnLowToHighPage()
{
    String browser = loadprop.getProperty("browser");
    assertURL("https://demo.nopcommerce.com/clothing?orderby=10");

}

public void userShouldBeAbleToSeePriceSortedLowToHigh()
{
     verifyPriceIsAscendingOrDescendingOrder(_priceSortedBy);

}

}
