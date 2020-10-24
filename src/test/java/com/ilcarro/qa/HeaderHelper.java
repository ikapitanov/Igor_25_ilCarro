package com.ilcarro.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderHelper extends HelperBase{

    public HeaderHelper(WebDriver wd) {
        super(wd);
    }

    public boolean isSignUpTabPresentInHeader() {
        return !isElementPresent(By.cssSelector("[href='/signup']"));
    }

    public void clickLogInTabOnHeader() {
        click(By.cssSelector("[href='/login']"));
    }

    public String getEmailFromHeader() {
        return wd.findElement(By.cssSelector("[href='/account']")).getText();
    }

    public void openTermsFromHeader() {
        click(By.cssSelector("[href='/terms']"));
    }

    public void openSearchFromHeader() {
        click(By.cssSelector("[href='/search']"));
    }
}
