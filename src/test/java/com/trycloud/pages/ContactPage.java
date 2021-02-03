package com.trycloud.pages;

import com.trycloud.pages.base.BasePage;

public class ContactPage extends BasePage {

    public String expectedContactModuleTitle = "Contacts - Trycloud - QA";
    public String actualContactModuleTitle = driver.getTitle();


}
