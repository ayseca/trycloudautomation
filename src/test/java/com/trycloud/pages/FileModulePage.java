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
    String newFolderPlusIcon = "//span[@class='icon icon-add']";
    String uploadFileInsideFolder = "//span[.='Upload file']";
    String nestedFile = "//span[.='2020-11-20 (13)']";
    String settingButton = "//button[@class='settings-button']";
    String anyButton = "//input[@id='showRichWorkspacesToggle']";



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
        /*
        Web element file = driver.findElement(By.xpath("//div[@class='position-absolute bg-gray-dark rounded-2 text-white px-2 py-1 left-0 bottom-0 ml-2 mb-2']")).click(); //link text locator for uploading a photo..
        WebElement addFile = driver.findElement(By.linkText("Upload a photo...")).click();
        Mention the own path of the file location
        Add file method
        addFile.sendKeys("D:\Big Data on AWS\Images\caps.jpeg");// For setting a profile picture
        driver.findElement(By.linkText("Set new profile picture")).click();
        Thread.sleep(2000);// Image name can be of your choice
         */
        driver.findElement(By.xpath(fileIconXpath)).click();
        driver.findElement(By.xpath(plusButtonXpath)).click();
        driver.findElement(By.xpath(uploadFileButtonXpath)).sendKeys("C:\\Users\\ayshe\\OneDrive\\Pictures\\Ekran Görüntüleri\\2020-11-20 (5)");
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

    public void uploadFileInsideFolder(){
        driver.findElement(By.xpath(newFolderXpath)).click();
        driver.findElement(By.xpath(newFolderPlusIcon)).click();
        driver.findElement(By.xpath(uploadFileInsideFolder)).sendKeys("C:\\Users\\ayshe\\OneDrive\\Pictures\\Ekran Görüntüleri\\2020-11-20 (13)");
    }

    public boolean nestedFolderIsDisplayed(){
        return driver.findElement(By.xpath(nestedFile)).isDisplayed();
    }

    public void clickSettingsOptions(){
        driver.findElement(By.xpath(settingButton)).click();
        driver.findElement(By.xpath(anyButton)).click();
    }

    public boolean isAnyButtonSelected(){
        return driver.findElement(By.xpath(anyButton)).isSelected();
    }







}
