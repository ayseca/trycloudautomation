package com.trycloud.tests;

import com.trycloud.pages.HomePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.tests.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginFunctionalityTest extends TestBase {

    @Test
    public void loginSuccessfully(){

        HomePage homePage = new HomePage();

        String expectedURL = homePage.expectedURL;
        String actualURL = homePage.getUrl();

        Assert.assertEquals(actualURL, expectedURL, "You did not successfully login the homepage!");

    }

}
