package com.qagenic.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkbox {
    WebDriver driver;

    public Checkbox(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = "//form/input[1]")
    private WebElement checkB;

    public void clickSearchbox(){
        this.checkB.click();
    }
}
