package com.trycloud.tests;

import com.trycloud.pages.SelectedFilesPage;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectedFiles extends TestBase {
SelectedFilesPage files=new SelectedFilesPage();

@Test
    public void fileModulesAccessVerification(){
    files.fileIcon.click();

    String expected= files.expectedFileTitle;
    String actual=driver.getTitle();

    Assert.assertEquals(actual,expected,"We have access to the Files Module");

}

@Test
    public void selectAllFilesVerification() throws InterruptedException{
    files.fileIcon.click();
    WebElement webElement1=files.selectAllIcon;
    webElement1.click();
    Thread.sleep(3000);
    Assert.assertTrue(webElement1.isEnabled());
}


@Test
    public void addToFavVerification() throws InterruptedException{
    files.fileIcon.click();
    files.actionMenu.click();
    Thread.sleep(3000);
    files.addToFav.click();
    Thread.sleep(3000);
    Assert.assertTrue(files.favIconDisp());
}
}
