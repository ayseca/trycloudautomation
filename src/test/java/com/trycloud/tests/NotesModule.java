package com.trycloud.tests;

import com.trycloud.pages.AllFilesPage;
import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NotesModule extends TestBase {

       @BeforeMethod

       public void setUpMethod(){
        super.setUpMethod();
    }
    @Test

    public  void noteModuleTest(){
        AllFilesPage notes = new AllFilesPage();
        Assert.assertEquals(notes.notesGetActualTitle(),notes.expectedTitleNotes,"We dont have access to notes ");


    }
    @Test
    public void noteAddTest(){
        driver.findElement(By.xpath("//*[@id='appmenu']/li[7]")).click();
        // identifying the add note button
        WebElement addNote = driver.findElement(By.xpath("//*[@id='app-navigation-vue']/div[1]"));
        // clicking on add note
        addNote.click();
        // identifying the text area where to write the note
        WebElement writeNote = driver.findElement(By.xpath("//*[@id='note-container']/div/div[2]"));
        //Typing a message to the Note
        writeNote.sendKeys("New Note", Keys.ENTER );
    }
    @AfterMethod
    public void tearDown() {
        super.tearDown();
    }





}
