package com.trycloud.pages;

import com.trycloud.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FileModulePage extends BasePage { //Base page driver
    @FindBy(xpath = "(//a[@href='/index.php/apps/files/'])[1]")
    public WebElement fileIconXpath;

    @FindBy(xpath = "//a[@class='action action-menu permanent']")
    public WebElement actionIconXpath;

    @FindBy(xpath = "//a[@class='menuitem action action-favorite permanent']/span[1]")
    public WebElement starIconXpath;

    @FindBy(xpath = "//div[@class='favorite-mark permanent']/span[1]")
    public WebElement starIconOnTopOfFile;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement plusButtonXpath;

    @FindBy(xpath = "(//*[@class='menuitem'])[1]")
    public WebElement uploadFileButtonXpath ;

    @FindBy(xpath = "//span[text()='3434']")
    public WebElement fileNameXpath ;

    @FindBy(xpath = "//span[text()='New folder']")
    public WebElement newFolderXpath ;

    @FindBy(xpath = "//input[@id='view13-input-folder']")
    public WebElement inputBoxXpath ;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement submitXpath ;

    @FindBy(xpath = "//span[text()='new folder']")
    public WebElement folderName ;

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement newFolderPlusIcon ;

    @FindBy(xpath = "//span[.='Upload file']")
    public WebElement uploadFileInsideFolder ;

    @FindBy(xpath = "//span[.='2020-11-20 (13)']")
    public WebElement nestedFile ;

    @FindBy(xpath = "//button[@class='settings-button']")
    public WebElement settingButton ;

    @FindBy(xpath = "//input[@id='showRichWorkspacesToggle']")
    public WebElement anyButton ;

    @FindBy(xpath = "//p[.='583 KB used']")
    public WebElement storageUsage ;




    public void removeFileFromFavorite(){
        fileIconXpath.click();
        actionIconXpath.click();
        starIconXpath.click();

        actionIconXpath.click();
        starIconXpath.click();

    }

    public boolean starIconDisplayed(){
        return  starIconOnTopOfFile.isDisplayed();
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
        fileIconXpath.click();
        plusButtonXpath.click();
        uploadFileButtonXpath.sendKeys("C:\\Users\\ayshe\\OneDrive\\Pictures\\Ekran Görüntüleri\\2020-11-20 (5)");
    }

    public boolean fileIsDisplayed(){
        return fileNameXpath.isDisplayed();
    }

    public void createNewFolder(){
        fileIconXpath.click();
        plusButtonXpath.click();
        newFolderXpath.click();
        inputBoxXpath.sendKeys("folder1");
        submitXpath.click();
    }

    public boolean folderIsDisplayed(){
        return folderName.isDisplayed();
    }

    public void uploadFileInsideFolder(){
        newFolderXpath.click();
        newFolderPlusIcon.click();
        uploadFileInsideFolder.sendKeys("C:\\Users\\ayshe\\OneDrive\\Pictures\\Ekran Görüntüleri\\2020-11-20 (13)");
    }

    public boolean nestedFolderIsDisplayed(){
        return nestedFile.isDisplayed();
    }

    public void clickSettingsOptions(){
        settingButton.click();
        anyButton.click();
    }

    public boolean isAnyButtonSelected(){
        return anyButton.isSelected();
    }

    public boolean storageUsage(){
        fileIconXpath.click();
        String storage = storageUsage.getText();
        StringBuilder beforeUpload = new StringBuilder();

        for (Character each : storage.toCharArray()) {
            if (Character.isDigit(each)) {
                beforeUpload.append(each);
            }
        }

        int before = Integer.parseInt(String.valueOf(beforeUpload));

        uploadFile();

        driver.navigate().refresh();

        StringBuilder afterUpload = new StringBuilder();

        for (Character each : storage.toCharArray()){
            if (Character.isDigit(each)) {
                afterUpload.append(each);
            }
        }

        int after = Integer.parseInt(String.valueOf(afterUpload));

        return after>before;
    }

}
