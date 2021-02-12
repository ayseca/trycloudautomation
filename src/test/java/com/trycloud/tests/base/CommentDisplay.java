package com.trycloud.tests.base;

import com.trycloud.pages.base.WriteComment;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CommentDisplay extends TestBase {

    @Test
    public void  commentDisplay(){
        WriteComment writeComment = new WriteComment();
        writeComment.Comment();
        Assert.assertTrue(writeComment.CommentDisplayed());
    }

}
