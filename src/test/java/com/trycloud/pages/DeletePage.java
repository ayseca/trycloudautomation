package com.trycloud.pages;

import com.trycloud.pages.base.BasePage;
import org.openqa.selenium.By;

public class DeletePage extends BasePage {

    String fileModule = "//body//div//a[@href='/index.php/apps/files/']";
    String actionIcon ="//*[@id='fileList']/tr[1]/td[2]/a/span[2]/a[2]";
    String deleteFile ="//*[@id='fileList']/tr[1]/td[2]/div/ul/li[8]/a";
    String deletedFilesModule ="//*[@id='app-navigation']/ul/li[7]/a";

    public void DeleteFile(){
        driver.findElement(By.xpath(fileModule)).click();
        driver.findElement(By.xpath(actionIcon)).click();
        driver.findElement(By.xpath(deleteFile)).click();
        driver.findElement(By.xpath(deletedFilesModule)).click();


    }

    public boolean fileDisplay(){

        return driver.findElement(By.xpath(deletedFilesModule)).isDisplayed();
    }


}
