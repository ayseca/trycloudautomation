package com.trycloud.pages;

import com.trycloud.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalkPage extends BasePage {

    public TalkPage(){
        PageFactory.initElements(driver, this);
    }

    public String expectedInTitle = "Talk";
    public String message = "Hello User100";

    @FindBy(xpath="(//a[@aria-label='Talk'])[1]")
    public WebElement talkModuleButton;

    @FindBy(xpath="//input[@class='app-navigation-search__input']")
    public WebElement searchBox;

    @FindBy(xpath="//a[@aria-label='Conversation, User100']")
    public WebElement user100;

    @FindBy(xpath="//div[@placeholder='Write message, @ to mention someone …']")
    public WebElement messageBox;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[.='Hello User100']")
    public WebElement sendingMessage;

    public String actualTitle(){
        talkModuleButton.click();
        return driver.getTitle();
    }

    public void sendMessage(){
        talkModuleButton.click();
        searchBox.sendKeys("User100");
        user100.click();
        messageBox.sendKeys(message);
        submitButton.click();
    }




}
