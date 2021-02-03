package com.trycloud.pages;

import com.trycloud.pages.base.BasePage;

public class HomePage extends BasePage {

    public String expectedURL = "http://app.trycloud.net/index.php/apps/files/?dir=/&fileid=53902";

    public String getUrl(){
        return driver.getCurrentUrl();
    }
}
