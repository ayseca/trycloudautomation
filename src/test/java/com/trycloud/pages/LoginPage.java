package com.trycloud.pages;

import com.trycloud.pages.base.BasePage;
import com.trycloud.utilities.ConfigurationReader;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    String userNameBoxXpath = "//input[@id='user']";
    String passwordBoxXpath = "//input[@id='password']";
    String logInButtonXpath = "//input[@id='submit-form']";

    public void login(){
        driver.findElement(By.xpath(userNameBoxXpath)).sendKeys(ConfigurationReader.getProperty("username"));
        driver.findElement(By.xpath(passwordBoxXpath)).sendKeys(ConfigurationReader.getProperty("password"));
        driver.findElement(By.xpath(logInButtonXpath)).click();
    }



}
