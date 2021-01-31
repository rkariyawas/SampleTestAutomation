package com.qa.pages;

import com.qa.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {


    String hmeDiv = "//h5[text()='Widgets']";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isWidgetClicked(){
        return isClick(By.xpath(hmeDiv));
    }

}
