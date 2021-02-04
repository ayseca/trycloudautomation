package com.trycloud.tests;

import com.trycloud.pages.DeletePage;
import com.trycloud.tests.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteAFileOrFolder extends TestBase {

@Test
    public void deleteFile(){

    DeletePage deletePage = new DeletePage();
    deletePage.DeleteFile();
    Assert.assertTrue(deletePage.fileDisplay());




    }



}
