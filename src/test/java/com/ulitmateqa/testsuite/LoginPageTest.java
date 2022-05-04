package com.ulitmateqa.testsuite;

import com.ulitmateqa.testbase.TestBase;
import com.ultimateqa.pages.Homepage;
import com.ultimateqa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    Homepage homePage = new Homepage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnSignInLink();
        String expectedMessage = "Welcome Back!";
        String actualMessage = homePage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not verify Message :");
    }
    @Test
    public void verifyTheErrorMessage(){
        homePage.clickOnSignInLink();
        loginPage.enterEmailId("prime123@gmail.com");
        loginPage.enterPassword("prime123");
        loginPage.clickOnLoginBtn();
        String expectedMessage = "Invalid email or password.";
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not verify login deatils :");
    }
}
