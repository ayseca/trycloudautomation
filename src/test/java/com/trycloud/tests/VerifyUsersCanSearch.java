package com.trycloud.tests;

import com.trycloud.pages.HomePage;
import com.trycloud.pages.searchFunctionality;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyUsersCanSearch extends TestBase {

    @Test
    public void verify_search() throws InterruptedException {
        //search any thing

        searchFunctionality verifySearch= new searchFunctionality();
        verifySearch.searchIcon.click();
        String searchValue = "user13";
        verifySearch.searchBar.sendKeys(searchValue+Keys.ENTER);


        Assert.assertTrue(driver.findElement(By.xpath("//h3[@class='unified-search__result-line-one']")).isDisplayed());
    }


}
/*
    Thread.sleep(2000);
        driver.findElement(By.cssSelector("svg[class='material-design-icon__svg']")).click();
        Thread.sleep(2000);
        WebElement searchItem = driver.findElement(By.xpath("//input[@class='unified-search__form-input']"));
        String searchValue = "readme";

 */