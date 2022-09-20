package com.qagenic;

import org.openqa.selenium.WebDriver;

import com.qagenic.pageobjects.Checkbox;

public class PageInitiator {
    WebDriver driver;
    Checkbox checkbox;

    public PageInitiator(){
        this.driver = new WebdriverInit().createWebDriver();
        this.checkbox = new Checkbox(driver);

    }
}
