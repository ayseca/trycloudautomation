package com.trycloud.tests;

import com.trycloud.pages.TalkPage;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
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

   @Test(description = "verify users can send message")
   public void verifyMessageDisplayed(){
      TalkPage talkPage = new TalkPage();
      talkPage.sendMessage();
      BrowserUtils.sleep(3);
      Assert.assertTrue(talkPage.sendingMessage.isDisplayed());
      BrowserUtils.sleep(3);
   }



}
