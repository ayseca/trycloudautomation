package com.trycloud.tests;

import com.trycloud.pages.TalkPage;
import com.trycloud.tests.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TalkModuleFunctionalityTest extends TestBase {

   @Test(description = "verify the page title")
    public void verifyTalkPageTitle(){
       TalkPage talkPage = new TalkPage();

       String expected = talkPage.expectedInTitle;
       String actual = talkPage.actualTitle();

       Assert.assertTrue(actual.contains(expected));
   }



}
