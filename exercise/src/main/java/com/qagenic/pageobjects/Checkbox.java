package com.qagenic.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkbox {

    public Checkbox(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "//form/input[1]")
    private WebElement checkb;

    public void clickSearchbox(){
        this.checkb.click();
    }
}
