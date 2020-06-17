package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    //Page Factory -OR

    @FindBy(name = "email")
    WebElement userName;

    @FindBy(name = "password")
    WebElement passWord;

    @FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
    WebElement loginButton;

    public LoginPage() {
        PageFactory.initElements(driver, this);   //this is pointing to the current class object
    }

    //Actions
    public String validateLoginPageTitle() {
        return driver.getTitle();
    }

    public HomePage login(String uNam, String pWord) {
        userName.sendKeys(uNam);
        passWord.sendKeys(pWord);
        loginButton.click();
        return new HomePage();
    }
}
