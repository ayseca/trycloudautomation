package com.trycloud.pages;

import com.trycloud.pages.base.BasePage;
import com.trycloud.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public String expectedMessage = "Wrong username or password.";

    @FindBy(id = "user")
    public WebElement inputUserName;

    @FindBy(id = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginButton;

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement warningMessage;

    public void login(){

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
