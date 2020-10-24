package com.ilcarro.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {
    //preconditions: user should be logged out
    @BeforeMethod
    public void ensurePreconditions(){
        if (isSignUpTabPresentInHeader()){   //sing up not present
            logOut();   //click on Input button
        }
    }

    @Test
    public void testSignUp() throws InterruptedException {

        //click on SignUp button
        openRegistrationFormFromHeader();
        Assert.assertTrue(isRegistrationFormOpened());

        //fill registration form
        fillRegistrationForm(new User()
                .withFirstName("AD")
                .withSecondName("RV")
                .withEmail("qwertyu14@gmail.com")
                .withPassword("Qwerty12345"));

        selectPolicyCheckBox();

        pause(2000);
        clickSubmitButton();

        //check login form displayed
        Assert.assertTrue(isLoginFormPresent());
    }


}
