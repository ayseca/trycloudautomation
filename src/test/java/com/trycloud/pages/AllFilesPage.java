package com.trycloud.pages;

import com.trycloud.pages.base.BasePage;
import org.openqa.selenium.By;

public class AllFilesPage extends BasePage {
    public String expectedTitleFiles="Files - Trycloud QA";
    public String expectedTitleActivities="Activity - Trycloud QA";
    public String expectedTitleGallery="Gallery - Tryclou ";
    public String expectedTitleTalk="Talk - Trycloud QA";
    public String expectedTitleCalendar="February 2021 - Calendar - Trycloud QA";
    public String expectedTitleDeck="Deck - Trycloud QA";
    public String expectedTitleContacts="Contacts - Trycloud QA";

    public String filesGetActualTitle(){
        driver.findElement(By.xpath("//body//div//a[@href='/index.php/apps/files/']")).click();
        return driver.getTitle();
    }

    public String activityGetActualTitle(){
        driver.findElement(By.xpath("//body//div//a[@href='/index.php/apps/activity/']")).click();
        return driver.getTitle();
    }
    public String galleryGetActualTitle(){
        driver.findElement(By.xpath("//body//div//a[@href='/index.php/apps/photos/']")).click();
        return driver.getTitle();
    }
    public String talkGetActualTitle(){
        driver.findElement(By.xpath("//body//div//a[@href='http://qa2.trycloud.net/index.php/apps/spreed/']")).click();
        return driver.getTitle();
    }
    public String calendarGetActualTitle(){
        driver.findElement(By.xpath("//body//div//a[@href='/index.php/apps/calendar/']")).click();
        return driver.getTitle();
    }
    public String contactsGetActualTitle(){
        driver.findElement(By.xpath("//body//div//a[@href='/index.php/apps/contacts/']")).click();
        return driver.getTitle();
    }
    public String deckGetActualTitle(){
        driver.findElement(By.xpath("//body//div//a[@href='/index.php/apps/deck/']")).click();
        return driver.getTitle();
    }
}
