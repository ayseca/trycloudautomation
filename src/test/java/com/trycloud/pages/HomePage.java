package com.trycloud.pages;

import com.trycloud.pages.base.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public String expectedURL = "http://qa2.trycloud.net/index.php/apps/dashboard/";

    String clickButtonXpath = "(//a[@aria-label='Contacts'])[1]";

    public void ContactModule(){
        driver.findElement(By.xpath(clickButtonXpath)).click();
    }

    public String getUrl(){
        return driver.getCurrentUrl();
    }
}
