package com.trycloud.pages;

import com.trycloud.pages.base.BasePage;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(){
        PageFactory.initElements(driver, this);
    }


    public String expectedURL = "http://qa2.trycloud.net/index.php/apps/dashboard/";


    public String getUrl(){
        return driver.getCurrentUrl();
    }
}
