package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CalenderPage;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    CalenderPage calenderPage;
    ContactPage contactPage;

    public HomePageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        calenderPage = new CalenderPage();
        contactPage = new ContactPage();
        homePage = loginPage.login(prop.getProperty("userName"), prop.getProperty("passWord"));

    }

    @Test(priority = 1)
    public void verifyHomePage() {
        String homePageTitle = homePage.verifyHomePage();
        Assert.assertEquals(homePageTitle, "Cogmento CRM", "home page title is not matched");

        System.out.println(homePageTitle);
    }

    @Test(priority = 2)
    public void verifyUserName() {
        boolean isUser = homePage.verifyUserName();
        Assert.assertEquals(isUser, true, "usesr is not verify");
    }

    @Test(priority = 3)
    public void verifyCalenderPage() {
        calenderPage = homePage.clickOnCalenderPage();
    }

    @Test(priority = 4)
    public void verifyContactPage() {
        contactPage = homePage.clickOnContactPage();
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
