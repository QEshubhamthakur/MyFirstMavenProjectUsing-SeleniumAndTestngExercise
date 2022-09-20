package com.qagenic;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.qagenic.utils.ConfigFileReader;


public class Baseclass {
    PageInitiator pages;

    @BeforeClass
    public void test_setup() {
        pages = new PageInitiator();
    }

    @AfterClass
    public void test_teardown() {
        pages.driver.close();
    }

    public void launchApplication() {
        pages.driver.get(ConfigFileReader.getValue("URL"));
    }

    public void launchApplication(String url) {
        pages.driver.get(url);
    }
}