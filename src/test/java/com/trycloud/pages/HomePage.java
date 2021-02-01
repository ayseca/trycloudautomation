package com.trycloud.pages;

import com.trycloud.pages.base.BasePage;

public class HomePage extends BasePage {

    public String expectedURL = "http://qa.trycloud.net/index.php/apps/files/";

    public String getUrl(){
        return driver.getCurrentUrl();
    }
}
