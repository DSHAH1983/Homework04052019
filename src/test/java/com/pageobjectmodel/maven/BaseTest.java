package com.pageobjectmodel.maven;

import org.junit.After;
import org.junit.Before;

public class BaseTest extends Utils
{
    BrowserSelector browserSelector = new BrowserSelector();
    @Before
    public void openBrowser()
    {
        browserSelector.setUpBrowser();
        currentUrl("https://demo.nopcommerce.com/");

    }

    @After
    public void closeBrowser()
    {
        browserScreentshot();
        driver.quit();
    }
}
