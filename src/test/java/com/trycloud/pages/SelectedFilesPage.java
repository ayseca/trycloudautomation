package com.trycloud.pages;

import com.trycloud.pages.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectedFilesPage extends BasePage {
    public SelectedFilesPage(){ PageFactory.initElements(driver, this); }

    public String expectedFileTitle="Files - Trycloud";


@FindBy(xpath = "//a[@href='/index.php/apps/files/'][1]")
    public WebElement fileIcon;

@FindBy(xpath = "//*[@for='select_all_files']")
    public WebElement selectAllIcon;

@FindBy(xpath = "//a[@class='action action-menu permanent'][1]")
    public WebElement actionMenu;

@FindBy(xpath = "//span[@class='icon icon-starred']")
    public WebElement addToFav;

@FindBy(xpath = "//div[@class='favorite-mark permanent']/span[1]")
public WebElement favIcon;

    public boolean favIconDisp(){

        return  favIcon.isDisplayed();
    }






}
