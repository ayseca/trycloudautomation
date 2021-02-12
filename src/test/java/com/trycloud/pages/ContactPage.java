package com.trycloud.pages;

import com.trycloud.pages.base.BasePage;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends BasePage {

    public ContactPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//a[@href='/index.php/apps/contacts/'])[1]")//
    WebElement contactIcon;

    @FindBy(xpath = "//button[@class='icon-add']")
    WebElement newContactButton;

    @FindBy(xpath = "//input[@id='contact-title']")
    WebElement tittleBoxXpath;

    @FindBy(xpath = "//input[@inputmode='tel']")
    WebElement phoneBoxXpath;

    @FindBy(xpath = "//input[@inputmode='email']")
    WebElement emailBoxXpath;

    @FindBy (xpath = " (//input[@class='property__value'])[2]")
    WebElement postOfficeBoxXpath;

    @FindBy(xpath = "(//input[@class='property__value'])[4]")
    WebElement addressBoxXpath;

    @FindBy(xpath = "(//input[@class='property__value'])[4]")
    WebElement postalCodeBoxXpath;

    @FindBy(xpath = "(//input[@class='property__value'])[5]")
    WebElement cityBoxXpath;

    @FindBy (xpath = "(//input[@class='property__value'])[6]")
    WebElement stateXpath;

    @FindBy(xpath = "(//input[@class='property__value'])[7]")
    WebElement countryBoxXpath;

    @FindBy(xpath = "(//span[@class='multiselect__single'])[2] ")
    WebElement homePhoneButton;

    @FindBy(xpath = "//div[@class='app-content-list-item-line-two']")
    WebElement newContactName;
    //changes have been made





    public String expectedContactModuleTitle = "Contacts - Trycloud - QA";

    public String actualContactModuleTitle = driver.getTitle();

    //String contactIcon = "(//a[@href='/index.php/apps/contacts/'])[1]";

    //String tittleBoxXpath = "//input[@id='contact-title']";

    //String phoneBoxXpath  = "//input[@inputmode='tel']";

    //String emailBoxXpath = "//input[@inputmode='email']";

    //String postOfficeBoxXpath = "(//input[@class='property__value'])[2]";

    //String addressBoxXpath = "(//input[@class='property__value'])[4]";

    //String postalCodeBoxXpath = "(//input[@class='property__value'])[4]";

    //String cityBoxXpath ="(//input[@class='property__value'])[5]";

    // String stateXpath = "(//input[@class='property__value'])[6]";

    //String countryBoxXpath = "(//input[@class='property__value'])[7]";

    //String createContactButtonXpath = "//button[@class='primary']";

    //String homePhoneButton = "(//span[@class='multiselect__single'])[2]";

    //String newContactButton = "//button[@class='icon-add']";

    //String newContactName = "//div[@class='app-content-list-item-line-two']";


    /*
    public void clickCreateContactButton(){
        driver.findElement(By.xpath(createContactButtonXpath)).click();
    }
    */

    public void click(){
        contactIcon.click();
        newContactButton.click();

        //driver.findElement(By.xpath(String.valueOf(contactIcon))).click();
        //driver.findElement(By.xpath(String.valueOf(newContactButton))).click();
    }


    public void createContact(){

        tittleBoxXpath.sendKeys("Cybertek");
        //driver.findElement(By.xpath(String.valueOf(tittleBoxXpath))).sendKeys("Cybertek");
        phoneBoxXpath.sendKeys("123456789");
        //driver.findElement(By.xpath(String.valueOf(phoneBoxXpath))).sendKeys("123456789");
        emailBoxXpath.sendKeys("trycloud@mail.com");
        //driver.findElement(By.xpath(String.valueOf(emailBoxXpath))).sendKeys("trycloud@mail.com");
        postalCodeBoxXpath.sendKeys("1000");
        //driver.findElement(By.xpath(String.valueOf(postalCodeBoxXpath))).sendKeys("1000");
        addressBoxXpath.sendKeys("3456 Alaska street");
        //driver.findElement(By.xpath(String.valueOf(addressBoxXpath))).sendKeys("3456 Alaska street");
        postalCodeBoxXpath.sendKeys("11111");
        //driver.findElement(By.xpath(String.valueOf(postalCodeBoxXpath))).sendKeys("11111");
        cityBoxXpath.sendKeys("Anchorage");
        //driver.findElement(By.xpath(String.valueOf(cityBoxXpath))).sendKeys("Anchorage");
        stateXpath.sendKeys("Alaska");
        //driver.findElement(By.xpath(String.valueOf(stateXpath))).sendKeys("Alaska");
        countryBoxXpath.sendKeys("USA");
        //driver.findElement(By.xpath(String.valueOf(countryBoxXpath))).sendKeys("USA");

    }


    //public boolean ContactModuleDisplayed(){
        //return contactIcon.isDisplayed();
    //}

    public boolean NewContactNameDisplayed(){
        return  newContactName.isDisplayed();
    }






}
