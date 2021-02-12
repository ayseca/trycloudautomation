package com.trycloud.pages;

import com.trycloud.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeletePage extends BasePage {

    public DeletePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//body//div//a[@href='/index.php/apps/files/']")
            public WebElement fileModule;

    @FindBy(xpath = "//*[@id='fileList']/tr[1]/td[2]/a/span[2]/a[2]")
            public WebElement actionIcon;
   @FindBy(xpath="//*[@id='fileList']/tr[1]/td[2]/div/ul/li[8]/a")
           public WebElement deleteFile;
    @FindBy(xpath = "//*[@id='app-navigation']/ul/li[7]/a")
           public WebElement deletedFilesModule;

    public void DeleteFile(){
        fileModule.click();
        actionIcon.click();
        deleteFile.click();
        deletedFilesModule.click();


    }

    public boolean fileDisplay(){

        return deletedFilesModule.isDisplayed();
    }


}
