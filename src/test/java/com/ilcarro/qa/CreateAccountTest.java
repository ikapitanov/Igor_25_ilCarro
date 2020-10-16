package com.ilcarro.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {
    //preconditions: user shoud be logged out
    @BeforeMethod
    public void ensurePreconditions(){
        if (!isElementPresent(By.cssSelector("[href='/signup']"))){   //sing up not present
            wd.findElement(By.xpath("//a[contains(., 'logOut')]")).click();   //click on Input button
        }

    }

    @Test
    public void testSignUp(){
        //click on SignUp buton
        wd.findElement((By.cssSelector("[href='/signup']"))).click();
        Assert.assertTrue(isElementPresent(By.cssSelector("form.signup__fields")));

        //fill registration form
        wd.findElement(By.cssSelector("#first_name")).click();
        wd.findElement(By.cssSelector("#first_name")).clear();
        wd.findElement(By.cssSelector("#first_name")).sendKeys("Igor");

        wd.findElement(By.cssSelector("#second_name")).click();
        wd.findElement(By.cssSelector("#second_name")).clear();
        wd.findElement(By.cssSelector("#second_name")).sendKeys("Kapitanov");

        wd.findElement(By.cssSelector("#email")).click();
        wd.findElement(By.cssSelector("#email")).clear();
        wd.findElement(By.cssSelector("#email")).sendKeys("kapitanov26@gmail.com");

        wd.findElement(By.cssSelector("#password")).click();
        wd.findElement(By.cssSelector("#password")).clear();
        wd.findElement(By.cssSelector("#password")).sendKeys("Qwerty12345");

        wd.findElement(By.cssSelector("#check_policy")).click();
        //click submit button

        //check login form displayed
    }



}
