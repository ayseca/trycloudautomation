package com.trycloud.pages.base;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    protected WebDriver driver = Driver.get();
}
