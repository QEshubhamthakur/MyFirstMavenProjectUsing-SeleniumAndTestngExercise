package com.qagenic;

import org.openqa.selenium.WebDriver;

import com.qagenic.utils.ConfigFileReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverInit {

    private WebDriver driver;
    
    public WebDriver createWebDriver() {
        String browser = ConfigFileReader.getValue("browser");

        switch (browser) {
            case "firefox":
                driver = WebDriverManager.firefoxdriver().create();
                break;
            case "chrome":
                driver = WebDriverManager.chromedriver().create();
                break;
            case "safari":
                driver = WebDriverManager.safaridriver().create();
            case "edge":
                driver = WebDriverManager.edgedriver().create();
            default:
                driver = WebDriverManager.chromedriver().create();
                break;
        }

        return driver;
    }

}
