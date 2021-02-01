package com.trycloud.tests;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginWithInvalidCredentials {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = Driver.get();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfigurationReader.getProperty("url"));
        driver.manage().window().maximize();
        LoginPage loginPage = new LoginPage();
        loginPage.loginWithInvalidCredential();
    }

    @Test
    public void loginFailed(){

        LoginPage loginPage = new LoginPage();

        String expectedMessage = loginPage.expectedMessage;
        String actualMessage = loginPage.getActualMessage();

        Assert.assertEquals(actualMessage,expectedMessage, "You logged in successfully!");
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
