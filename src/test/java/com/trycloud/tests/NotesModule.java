package com.trycloud.tests;

import com.trycloud.pages.AllFilesPage;
import com.trycloud.pages.NotePage;
import com.trycloud.tests.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotesModule extends TestBase {

    @Test
    public void noteModuleTest(){
        AllFilesPage notes = new AllFilesPage();
        Assert.assertEquals(notes.notesGetActualTitle(),notes.expectedTitleNotes,"We don't have access to notes ");

    }
    @Test
    public void noteAddTest(){

        NotePage notePage = new NotePage();

        notePage.addNotes();
    }

    @Test
    public  void isDisplayed(){

        NotePage notePage = new NotePage();

      Assert.assertTrue(notePage.newNotesDisplayed());
    }

}
