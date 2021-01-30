package com.trycloud.utilities;

import org.openqa.selenium.WebDriver;

public class Driver {
    private static WebDriver driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));

    private Driver() {
    }

    public static WebDriver get() {
        return driver;
    }
}
