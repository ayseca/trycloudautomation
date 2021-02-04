package com.trycloud.tests.base;

import com.trycloud.pages.base.DeletePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteAFileOrFolder extends TestBase{

@Test
    public void deleteFile(){

    DeletePage deletePage = new DeletePage();
    deletePage.DeleteFile();
    Assert.assertTrue(deletePage.fileDisplay());




    }



}
