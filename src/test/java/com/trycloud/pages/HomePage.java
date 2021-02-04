package com.trycloud.pages;

import com.trycloud.pages.base.BasePage;

public class HomePage extends BasePage {

    public String expectedURL = "http://qa2.trycloud.net/index.php/apps/dashboard/";

    public String getUrl(){
        return driver.getCurrentUrl();
    }
}
