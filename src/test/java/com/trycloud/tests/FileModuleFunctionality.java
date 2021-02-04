package com.trycloud.tests;

import com.trycloud.pages.FileModulePage;
import com.trycloud.tests.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileModuleFunctionality extends TestBase {


    @Test
    public void removeFile(){
        FileModulePage file = new FileModulePage();
        file.removeFileFromFavorite();
        Assert.assertTrue(file.starIconDisplayed());
    }

    @Test
    public void uploadFile(){
        FileModulePage file = new FileModulePage();
        file.uploadFile();
        Assert.assertTrue(file.fileIsDisplayed());
    }

    @Test
    public void uploadFolder(){
        FileModulePage file = new FileModulePage();
        file.createNewFolder();
        Assert.assertTrue(file.folderIsDisplayed());
    }




}
