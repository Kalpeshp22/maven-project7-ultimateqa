package com.ultimateqa.pages;

import com.ultimateqa.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By welcomeText = By.className("page__heading");
    By emailField = By.id("user[email]");
    By passwordField = By.id("user[password]");
    By loginBtn = By.xpath("//input[@value='Sign in']");
    By invalidEmailOrPassword = By.className("form-error__list-item");

    public String getWElcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginBtn() {
        clickOnElement(loginBtn);
    }

    public String getErrorMessage() {
        return getTextFromElement(invalidEmailOrPassword);
    }
}
