package com.trycloud.tests;

import com.trycloud.pages.FileModulePage;
import com.trycloud.tests.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileModuleFunctionality extends TestBase {

    FileModulePage file = new FileModulePage();


    @Test
    public void removeFile(){
        file.removeFileFromFavorite();
        Assert.assertTrue(file.starIconDisplayed());
    }

    @Test
    public void uploadFile(){
        file.uploadFile();
        Assert.assertTrue(file.fileIsDisplayed());
    }

    @Test
    public void uploadFolder(){
        file.createNewFolder();
        Assert.assertTrue(file.folderIsDisplayed());
    }

    @Test
    public void uploadFileInsideFolder(){
        file.uploadFileInsideFolder();
        Assert.assertTrue(file.nestedFolderIsDisplayed());
    }




}
