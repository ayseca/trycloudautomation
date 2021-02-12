package com.trycloud.tests.base;

import com.trycloud.pages.base.WriteCommentPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CommentDisplay extends TestBase {

    @Test
    public void  commentDisplay(){
        WriteCommentPage writeCommentPage = new WriteCommentPage();
        writeCommentPage.Comment();
        Assert.assertTrue(writeCommentPage.CommentDisplayed());
    }

}
