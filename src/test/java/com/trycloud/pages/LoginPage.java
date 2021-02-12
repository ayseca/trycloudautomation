package com.trycloud.pages;

import com.trycloud.pages.base.BasePage;
import com.trycloud.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public String expectedMessage = "Wrong username or password.";

    @FindBy(xpath = "//input[@id='user']")
    public WebElement inputUserName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginButton;

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement warningMessage;

    public void login(){
        //username box xpath
        inputUserName.sendKeys(ConfigurationReader.getProperty("username"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }

    public void loginWithInvalidCredential(){
        inputUserName.sendKeys(ConfigurationReader.getProperty("username"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("invalidPassword"));
        loginButton.click();
    }

    public String getActualMessage(){
        return warningMessage.getText();
    }

}
