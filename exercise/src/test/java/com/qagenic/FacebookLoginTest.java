package com.qagenic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLoginTest {
    WebDriver driver;
    String urll = "http://www.fb.com";


    @BeforeClass
    public void start_browser_session(){
        driver = WebDriverManager.chromedriver().create();
    }

    @Test
    public void facebook_login_test(){
        driver.get(urll);
        driver.findElement(By.id("email")).sendKeys("trial");
        driver.findElement(By.id("pass")).sendKeys("try");
        driver.findElement(By.cssSelector("button[name='login']")).click();
        String emessage = driver.findElement(By.xpath("//div[@id='email_container']/div[2]")).getText();

        System.out.println(emessage);
        Assert.assertEquals(emessage , "The email address or mobile number you entered isn't connected to an account. Find your account and log in.");
    }
   
}
