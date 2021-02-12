package com.trycloud.pages;

import com.trycloud.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WriteCommentPage extends BasePage {
    public WriteCommentPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//body//div//a[@href='/index.php/apps/files/']")
            public WebElement fileModule;

    @FindBy(xpath = "//*[@id='fileList']/tr[1]/td[2]/a/span[2]/a[2]")
    public WebElement actionIcon;


    @FindBy(xpath = "//li[@class=' action-details-container']")
    public WebElement detail;
    //*[@id="fileList"]/tr[2]/td[2]/div/ul/li[4]
    //*[@id="fileList"]/tr[2]/td[2]/div/ul/li[4]

    @FindBy(xpath = "//*[@id='commentsTabView']")
    public WebElement commentsTab;

    @FindBy(xpath = "//*[@id='commentsTabView']/div[1]/form/div[1]")
    public WebElement commentBox;

    @FindBy(xpath = "//*[@id='commentsTabView']/ul/li")
    public WebElement commentDisplay;





    public void Comment(){
        fileModule.click();
        actionIcon.click();
        detail.click();
        commentsTab.click();
        commentBox.sendKeys("good"+ Keys.ENTER);


    }

    public boolean CommentDisplayed(){
        return commentDisplay.isDisplayed();
    }
}
