package com.trycloud.pages;

import com.trycloud.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AllFilesPage extends BasePage {
    public AllFilesPage(){
        PageFactory.initElements(driver, this);
    }
    public String expectedTitleFiles="Files - Trycloud";
    public String expectedTitleActivities="Activity - Trycloud";
    public String expectedTitleGallery="Gallery - Trycloud ";
    public String expectedTitleCalendar="February 2021 - Calendar - Trycloud";
    public String expectedTitleDeck="Deck - Trycloud";
    public String expectedTitleContacts="Contacts - Trycloud";
    public String expectedTitleNotes;

    @FindBy(xpath = "//a[@href='/index.php/apps/files/']")
    public WebElement filesBtn;
    @FindBy(xpath = "//a[@href='/index.php/apps/activity/']")
    public WebElement activityBtn;
    @FindBy(xpath = "//a[@href='/index.php/apps/photos/']")
    public WebElement photosBtn;
    @FindBy(xpath = "//a[@href='/index.php/apps/calendar/']")
    public WebElement calendarBtn;
    @FindBy(xpath = "//a[@href='/index.php/apps/contacts/']")
    public WebElement contactsBtn;
    @FindBy(xpath = "//a[@href='/index.php/apps/deck/']")
    public WebElement deckBtn;

    public String notesGetActualTitle() {
        driver.findElement(By.xpath("//*[@id='appmenu']/li[7]")).click();
        return driver.getTitle();
    }
    public String activityGetActualTitle(){
        activityBtn.click();
        return driver.getTitle();
    }
    public String galleryGetActualTitle(){
        photosBtn.click();
        return driver.getTitle();
    }
    public String contactsGetActualTitle(){
        contactsBtn.click();
        return driver.getTitle();
    }
    public String calendarGetActualTitle(){
        calendarBtn.click();
        return driver.getTitle();
    }
    public String deckGetActualTitle(){
        deckBtn.click();
        return driver.getTitle();
    }




}
