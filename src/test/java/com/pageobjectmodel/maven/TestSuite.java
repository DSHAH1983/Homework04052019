package com.pageobjectmodel.maven;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

public class TestSuite extends BaseTest
{
    HomePage homepage = new HomePage();
    ClothingPage clothingpage = new ClothingPage();
    LowToHigh lowToHigh = new LowToHigh();
@Test
public void userShouldBeAbleToNavigateToHomepage()
{
      homepage.verifyUserOnHomePage();
}

public void userShouldBeAbleToSelectPriceInDollar()
{
     homepage.verifyDollarSignDisplayed();
}


public void userShouldBeAbleToSelectEuro()
{
    homepage.selectEuroUnderDropDownOnHomePage();
}


public void userShouldBeAbleToNavigateToClothingInApparelCategoryPage()
{
    homepage.navigateToClothingInApparelCategoryPage();
}

@Test
public void userShouldSeeLowToHighUnderSortBy()
{
    homepage.navigateToClothingInApparelCategoryPage();
    clothingpage.selectLowToHighUnderSortBy();
    lowToHigh.userShouldBeAbleToSeePriceSortedLowToHigh();
}


}
