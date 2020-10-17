package com.ilcarro.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {
    //preconditions: user shoud be logged out
    @BeforeMethod
    public void ensurePreconditions(){
        if (isSignUpTabPresentInHeader()){   //sing up not present
            logOut();   //click on Input button
        }

    }

    @Test
    public void testSignUp(){

        //click on SignUp button
        click((By.cssSelector("[href='/signup']")));
        Assert.assertTrue(isElementPresent(By.cssSelector("form.signup__fields")));

        //fill registration form
        type(By.cssSelector("#first_name"), "AX");
        type(By.cssSelector("#second_name"),"RV");
        type(By.cssSelector("#email"),"qwertyu11@gmail.com");
        type(By.cssSelector("#password"),"Qwerty12345");

        //click check policy
        click(By.cssSelector("#check_policy"));

        //click submit button
        clickSubmitButton();

        //check login form displayed
        Assert.assertTrue(isLoginFormPresent());
    }


}
