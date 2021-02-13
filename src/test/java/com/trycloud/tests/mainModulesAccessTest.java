package com.trycloud.tests;

import com.trycloud.pages.AllFilesPage;

import com.trycloud.tests.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class mainModulesAccessTest extends TestBase {
    AllFilesPage allModules = new AllFilesPage();


    @Test
    public void verifyMainModulesAccessFiles(){
        allModules.filesBtn.click();
        String filesGetActualTitle = driver.getTitle();
        String expectedTitleFiles = allModules.expectedTitleFiles;

        Assert.assertEquals(filesGetActualTitle,expectedTitleFiles, "We have access to Files");
    }
    @Test
    public void verifyMainModulesAccessActivities(){
        String expectedTitleActivities = allModules.expectedTitleActivities;
        String activityGetActualTitle = allModules.activityGetActualTitle();
        Assert.assertEquals(activityGetActualTitle,expectedTitleActivities, "We have access to Activities");
    }
    @Test
    public void verifyMainModulesAccessGallery(){
        String expectedTitleGallery = allModules.expectedTitleGallery;
        String galleryGetActualTitle = allModules.galleryGetActualTitle();
        Assert.assertFalse(Boolean.parseBoolean(galleryGetActualTitle),expectedTitleGallery);
    }
    @Test
    public void verifyMainModulesAccessCalendar(){
        String expectedTitleCalendar = allModules.expectedTitleCalendar;
        String calendarGetActualTitle = allModules.calendarGetActualTitle();
        Assert.assertEquals(calendarGetActualTitle,expectedTitleCalendar, "We have access to Calendar");
    }
    @Test
    public void verifyMainModulesAccessContacts(){
        String expectedTitleContacts = allModules.expectedTitleContacts;
        String contactsGetActualTitle = allModules.contactsGetActualTitle();
        Assert.assertEquals(contactsGetActualTitle,expectedTitleContacts, "We have access to Contacts");
    }
    @Test
    public void verifyMainModulesAccessDeck(){
        String expectedTitleDeck = allModules.expectedTitleDeck;
        String deckGetActualTitle = allModules.deckGetActualTitle();
        Assert.assertEquals(deckGetActualTitle,expectedTitleDeck, "We have access to Deck");
    }

}
