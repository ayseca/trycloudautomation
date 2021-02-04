package com.trycloud.tests;

import com.trycloud.pages.HomePage;
import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyUsersCanSearch extends TestBase {
    @BeforeMethod
    public void setupMethod() {
        super.setUpMethod();
    }

    @Test
    public void verfify_search() {
        WebElement searchItem = driver.findElement(By.id("searchbox"));
        searchItem.sendKeys("user1", Keys.ENTER);
        String expectedResult = "user1";
        WebElement searchWindow = driver.findElement(By.xpath("//h2[@class='empty-content__title']"));
        String actualResult = searchWindow.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
    //Verify the app displays the expected result option

}
