package com.trycloud.pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class WriteComment extends BasePage{
    String fileModule = "//body//div//a[@href='/index.php/apps/files/']";
    String actionIcon ="//*[@id='fileList']/tr[1]/td[2]/a/span[2]/a[2]";
    String detail ="//*[@id='fileList']/tr[1]/td[2]/div/ul/li[4]/a";
    String commentsTab ="//*[@id='commentsTabView']";
    String commentBox ="//*[@id='commentsTabView']/div[1]/form/div[1]";
    String commentDisplay="//*[@id='commentsTabView']/ul/li";

    //*[@id="fileList"]/tr[1]/td[2]/a/span[2]/a[2]
    //*[@id="fileList"]/tr[1]/td[2]/div/ul/li[4]/a
    //*[@id="commentsTabView"]
    ////*[@id="commentsTabView"]/div[1]/form/div[1]

    public void Comment(){
        driver.findElement(By.xpath(fileModule)).click();
        driver.findElement(By.xpath(actionIcon)).click();
        driver.findElement(By.xpath(detail)).click();
        driver.findElement(By.xpath(commentsTab)).click();
        driver.findElement(By.xpath(commentBox)).sendKeys("good"+ Keys.ENTER);


    }

    public boolean CommentDisplayed(){
        return driver.findElement(By.xpath(commentDisplay)).isDisplayed();
    }
}
