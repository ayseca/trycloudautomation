package com.trycloud.tests;

import com.trycloud.pages.HomePage;
import com.trycloud.pages.searchFunctionality;
import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyUsersCanSearch extends TestBase {

    @Test
    public void verify_search() throws InterruptedException {

        searchFunctionality verifySearch = new searchFunctionality();
        Thread.sleep(2000);
        verifySearch.searchIcon.click();
        String searchValue = "user13";
        Thread.sleep(2000);
        verifySearch.searchBar.sendKeys(searchValue + Keys.ENTER);
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//h3[@class='unified-search__result-line-one']")).isDisplayed());
    }
//commit

}