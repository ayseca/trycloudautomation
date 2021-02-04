package com.trycloud.pages;

import com.trycloud.pages.base.BasePage;
import org.openqa.selenium.By;

public class DeletePage extends BasePage {

    String actionIconXpath = "//a[@class='action action-menu permanent']";
    String deleteFileOption ="//a[@href='nav-icon-trashbin svg active]";
    String deleteCheckBox ="//input[@type='checkbox']";
    String deletedFile ="//span[@class='innernametext']";

    public void DeleteFile(){
        driver.findElement(By.xpath(actionIconXpath)).click();
        driver.findElement(By.xpath(deleteFileOption)).click();
        driver.findElement(By.xpath(deleteCheckBox)).click();


    }

    public boolean fileDisplay(){
        return driver.findElement(By.xpath(deletedFile)).isDisplayed();
    }


}
