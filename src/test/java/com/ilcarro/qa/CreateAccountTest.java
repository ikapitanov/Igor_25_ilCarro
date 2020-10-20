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
    public void testSignUp() throws InterruptedException {

        //click on SignUp button
        click((By.cssSelector("[href='/signup']")));
        Assert.assertTrue(isElementPresent(By.cssSelector("form.signup__fields")));

        //fill registration form
        fillRegistrationForm(new User()
                .withFirstName("AD")
                .withSecondName("RV")
                .withEmail("qwertyu14@gmail.com")
                .withPassword("Qwerty12345"));

        //click check policy
        click(By.cssSelector("#check_policy"));

        //click submit button
        pause(2000);
        clickSubmitButton();

        //check login form displayed
        Assert.assertTrue(isLoginFormPresent());
    }

    public void fillRegistrationForm(User user) {
        type(By.name("first_name"), user.getFirstName());
        type(By.name("second_name"), user.getSecondName());
        type(By.name("email"), user.getEmail());
        type(By.name("password"), user.getPassword());
    }



}
