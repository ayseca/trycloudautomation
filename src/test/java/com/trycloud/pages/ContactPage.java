package com.trycloud.pages;

import com.trycloud.pages.base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactPage extends BasePage {

    public String expectedContactModuleTitle = "Contacts - Trycloud - QA";

    public String actualContactModuleTitle = driver.getTitle();

    String contactIcon = "(//a[@href='/index.php/apps/contacts/'])[1]";

    String tittleBoxXpath = "//input[@id='contact-title']";

    String phoneBoxXpath  = "//input[@inputmode='tel']";

    String emailBoxXpath = "//input[@inputmode='email']";

    String postOfficeBoxXpath = "(//input[@class='property__value'])[2]";

    String addressBoxXpath = "(//input[@class='property__value'])[4]";

    String postalCodeBoxXpath = "(//input[@class='property__value'])[4]";

    String cityBoxXpath ="(//input[@class='property__value'])[5]";

    String stateXpath = "(//input[@class='property__value'])[6]";

    String countryBoxXpath = "(//input[@class='property__value'])[7]";

    //String createContactButtonXpath = "//button[@class='primary']";

    String homePhoneButton = "(//span[@class='multiselect__single'])[2]";

    String newContactButton = "//button[@class='icon-add']";

    String newContactName = "//div[.='New contact']";


    /*
    public void clickCreateContactButton(){
        driver.findElement(By.xpath(createContactButtonXpath)).click();
    }
    */

    public void click(){

        driver.findElement(By.xpath(contactIcon)).click();
        driver.findElement(By.xpath(newContactButton)).click();

    }


    public void createContact(){
        driver.findElement(By.xpath(tittleBoxXpath)).sendKeys("Cybertek");
        driver.findElement(By.xpath(phoneBoxXpath)).sendKeys("123456789");
        driver.findElement(By.xpath(emailBoxXpath)).sendKeys("trycloud@mail.com");
        driver.findElement(By.xpath(postalCodeBoxXpath)).sendKeys("1000");
        driver.findElement(By.xpath(addressBoxXpath)).sendKeys("3456 Alaska street");
        driver.findElement(By.xpath(postalCodeBoxXpath)).sendKeys("11111");
        driver.findElement(By.xpath(cityBoxXpath)).sendKeys("Anchorage");
        driver.findElement(By.xpath(stateXpath)).sendKeys("Alaska");
        driver.findElement(By.xpath(countryBoxXpath)).sendKeys("USA");

    }


    public boolean ContactModuleDisplayed(){
        return driver.findElement(By.xpath(contactIcon)).isDisplayed();
    }

    public boolean NewContactNameDisplayed(){
        return  driver.findElement(By.xpath(newContactName)).isDisplayed();
    }










    /*

     5.Story: As a user, I should be able to access to Contacts module.
Test case #1 - verify users can access to Talks module
1.Login as a user
2.Click "Contacts" module
3.Verify the page title is Contacts module's title



    Test case #2 - verify users can add contacts
1.Login as a user
2.Click contacts module
3.Click "New Contact" button
4.Fill out the contact info like : Title, Phone, email, address , etc
5.Verify the contact name is added to the contact list

     */






}
