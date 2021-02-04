package com.trycloud.pages;

import com.trycloud.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AllFilesPage extends BasePage {
    public String expectedTitleFiles = "Files - Trycloud";
    public String expectedTitleActivities = "Activity - Trycloud";
    public String expectedTitleGallery = "Gallery - Trycloud";
    public String expectedTitleTalk = "Talk - Trycloud";
    public String expectedTitleCalendar = "Calendar - Trycloud";
    public String expectedTitleDeck = "Deck - Trycloud";
    public String expectedTitleAnnouncements = "Announcements - Trycloud";
    public String expectedTitleNotes = "Notes - Trycloud - QA";

    public String notesGetActualTitle() {
        driver.findElement(By.xpath("//*[@id='appmenu']/li[7]")).click();

        return driver.getTitle();
    }

    public String filesGetActualTitle() {
        driver.findElement(By.xpath("//body//div//a[@href='/index.php/apps/files/']")).click();
        return driver.getTitle();
    }

    public String activityGetActualTitle() {
        driver.findElement(By.xpath("//body//div//a[@href='/index.php/apps/activity/']")).click();
        return driver.getTitle();
    }

    public String galleryGetActualTitle() {
        driver.findElement(By.xpath("//body//div//a[@href='/index.php/apps/gallery/']")).click();
        return driver.getTitle();
    }

    public String talkGetActualTitle() {
        driver.findElement(By.xpath("//body//div//a[@href='/index.php/apps/spreed/']")).click();
        return driver.getTitle();
    }

    public String calendarGetActualTitle() {
        driver.findElement(By.xpath("//body//div//a[@href='/index.php/apps/calendar/']")).click();
        return driver.getTitle();
    }
}
