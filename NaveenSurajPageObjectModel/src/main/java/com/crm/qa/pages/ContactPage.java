package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends TestBase {

    @FindBy(xpath = "//div[@class='ui loader']")
    WebElement contactLabel;

    public ContactPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean verifyContactPage(){
        return contactLabel.isDisplayed();
    }


}
