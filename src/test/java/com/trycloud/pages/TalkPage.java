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

    @FindBy(xpath="(//a[@aria-label='Talk'])[1]")
    public WebElement talkModuleButton;

    public String actualTitle(){
        talkModuleButton.click();
        return driver.getTitle();
    }


}
