package com.ilcarro.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class TestBase {
    static WebDriver wd;

    @BeforeSuite
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        wd.get("https://ilcarro-dev-v1.firebaseapp.com/");
    }

    public boolean isElementPresent(By locator){
        return wd.findElements(locator).size()>0;
    }

    public boolean isFindCarFormPresent(){
        return isElementPresent(By.cssSelector(".Main_mainpage__find_your_car__AHLkw"));

    }

    public boolean isFindCarFormPresent2(){
        return isElementPresent2(By.cssSelector(".Main_mainpage__find_your_car__AHLkw"));
    }

    public boolean isElementPresent2(By by){
        try {
            wd.findElement(by);
            return true;
        }catch (NoSuchElementException ex){
            return false;
        }
    }

    @AfterSuite
    public void tearDown(){
        wd.quit();
    }

    public boolean isLoginFormPresent() {
        return isElementPresent(By.cssSelector(".Login_login__right_block__1niYm"));

    }

    //fill login form
    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void click(By locator){
        wd.findElement(locator).click();
    }

    public void clickSubmitButton() {
        new WebDriverWait(wd, 15)
                .until(ExpectedConditions
                        .elementToBeClickable(By.cssSelector("[type='submit']"))).click();
    }

    public boolean isSignUpTabPresentInHeader() {
        return !isElementPresent(By.cssSelector("[href='/signup']"));
    }

    public void logOut() {
        click(By.xpath("//a[contains(., 'logOut')]"));
    }

    public void clickLogInTabOnHeader() {
        click(By.cssSelector("[href='/login']"));
    }

    public boolean isUserLoggedIn() {
        return isElementPresent(By.xpath("//a[contains(., 'logOut')]"));
    }



    public void pause(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }
}
