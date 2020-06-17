package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
    @FindBy(className = "user-display")
    WebElement userNameLabel;

    @FindBy(xpath = "//div[@id='main-nav']//a[2]")
    WebElement calenderLink;

    @FindBy(xpath = "//div[@id='main-nav']//a[3]")
    WebElement contactLink;

    //initializing the page object
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyHomePage() {
        return driver.getTitle();
    }

    public boolean verifyUserName() {
        return userNameLabel.isDisplayed();
    }

    public ContactPage clickOnContactPage() {
        contactLink.click();
        return new ContactPage();
    }

    public CalenderPage clickOnCalenderPage() {
        calenderLink.click();
        return new CalenderPage();
    }
}
