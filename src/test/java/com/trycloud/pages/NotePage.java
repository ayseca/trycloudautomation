package com.trycloud.pages;

import com.trycloud.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class NotePage  extends BasePage {

    public boolean newNotesDisplayed(){

       return driver.findElement(By.xpath("")).isDisplayed(); // We will put Note locators When we inspect

    }

    public  void addNotes(){

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


}
