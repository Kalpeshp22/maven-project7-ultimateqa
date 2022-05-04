package com.ultimateqa.pages;

import com.ultimateqa.utility.Utility;
import org.openqa.selenium.By;

public class Homepage extends Utility {

    By signinLink = By.xpath("//header/div[1]/div[1]/section[1]/ul[1]/li[1]/a[1]");
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome Back!')]");

    public void clickOnSignInLink(){
        clickOnElement(signinLink);
    }
    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }

}

