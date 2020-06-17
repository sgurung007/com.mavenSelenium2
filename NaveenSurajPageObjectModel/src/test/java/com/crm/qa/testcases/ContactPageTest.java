package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CalenderPage;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    ContactPage contactPage;

    public ContactPageTest() {
        super();
    }


    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        homePage = loginPage.login(prop.getProperty("userName"), prop.getProperty("passWord"));
        contactPage = homePage.clickOnContactPage();
    }

    @Test(priority = 1)
    public void verifyContactPage() {
        contactPage.verifyContactPage();
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
