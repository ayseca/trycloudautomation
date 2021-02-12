package com.trycloud.tests;

import com.trycloud.pages.ContactPage;
import com.trycloud.pages.HomePage;
import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.xpath.XPath;

public class ContactModuleTest extends TestBase {



    @Test

    public void test(){

        HomePage contactModule = new HomePage();

        ContactPage contactPage = new ContactPage();

        //contactModule.ContactModule();

        contactPage.click();

        contactPage.createContact();

        Assert.assertTrue(contactPage.NewContactNameDisplayed());











    }




}
