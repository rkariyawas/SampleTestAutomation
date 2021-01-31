package com.qa.tests;

import com.qa.base.BaseTest;
import com.qa.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void clickOnWidget(){
        HomePage hm = new HomePage(getDriver());
        boolean isWdget = hm.isWidgetClicked();
        Assert.assertTrue(isWdget);
    }
}
