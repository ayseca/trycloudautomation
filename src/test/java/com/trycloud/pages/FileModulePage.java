package com.trycloud.pages;

import com.trycloud.pages.base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class FileModulePage extends BasePage { //Base page driver
    String fileIconXpath = "(//a[@href='/index.php/apps/files/'])[1]";
    String actionIconXpath = "//a[@class='action action-menu permanent']";
    String starIconXpath = "//a[@class='menuitem action action-favorite permanent']/span[1]";
    String starIconOnTopOfFile = "//div[@class='favorite-mark permanent']/span[1]";
    String plusButtonXpath = "//a[@class='button new']";
    String uploadFileButtonXpath = "(//*[@class='menuitem'])[1]";
    String fileNameXpath = "//span[text()='3434']";
    String newFolderXpath = "//span[text()='New folder']";
    String inputBoxXpath = "//input[@id='view13-input-folder']";
    String submitXpath = "(//input[@type='submit'])[2]";
    String folderName = "//span[text()='new folder']";


    public void removeFileFromFavorite(){
        driver.findElement(By.xpath(fileIconXpath)).click();
        driver.findElement(By.xpath(actionIconXpath)).click();
        driver.findElement(By.xpath(starIconXpath)).click();

        driver.findElement(By.xpath(actionIconXpath)).click();
        driver.findElement(By.xpath(starIconXpath)).click();

    }

    public boolean starIconDisplayed(){
        return  driver.findElement(By.xpath(starIconOnTopOfFile)).isDisplayed();
    }

    public void uploadFile(){
        driver.findElement(By.xpath(fileIconXpath)).click();
        driver.findElement(By.xpath(plusButtonXpath)).click();
        driver.findElement(By.xpath(uploadFileButtonXpath)).click();
    }


    public boolean fileIsDisplayed(){
        return driver.findElement(By.xpath(fileNameXpath)).isDisplayed();
    }

    public void createNewFolder(){
        driver.findElement(By.xpath(fileIconXpath)).click();
        driver.findElement(By.xpath(plusButtonXpath)).click();
        driver.findElement(By.xpath(newFolderXpath)).click();
        driver.findElement(By.xpath(inputBoxXpath)).sendKeys("folder1");
        driver.findElement(By.xpath(submitXpath)).click();
    }

    public boolean folderIsDisplayed(){
        return driver.findElement(By.xpath(folderName)).isDisplayed();
    }







}
