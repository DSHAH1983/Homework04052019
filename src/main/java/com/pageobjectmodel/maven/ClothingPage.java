package com.pageobjectmodel.maven;

import org.openqa.selenium.By;

public class ClothingPage extends Utils
{
    LoadProp loadprop = new LoadProp();

    private By _clothingPage = By.xpath("//h1[contains(text(),'Clothing')]");
    private By _lowToHigh = By.xpath("//select[@aria-label='Select product sort order']");


    public void userIsOnClothingPage()
    {
        assertTextMessage("Clothing", _clothingPage);

    }

    public void selectLowToHighUnderSortBy()
    {
        String browser = loadprop.getProperty("browser");
        selectVisibleTextBy(_lowToHigh,"Price: Low to High");
    }

    public void selectHighToLowUnderSortBy()
    {
        selectVisibleTextBy(_clothingPage,"Price: High to Low");
    }

}
