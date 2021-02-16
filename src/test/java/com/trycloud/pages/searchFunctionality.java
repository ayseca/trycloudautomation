package com.trycloud.pages;

import com.trycloud.pages.base.BasePage;
import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchFunctionality  extends BasePage {
    public searchFunctionality(){ PageFactory.initElements(driver, this);
    }

    @FindBy(css = "svg[class='material-design-icon__svg']")
    public WebElement searchIcon;

    @FindBy(xpath="//input[@class='unified-search__form-input']")
    public WebElement searchBar;




}
