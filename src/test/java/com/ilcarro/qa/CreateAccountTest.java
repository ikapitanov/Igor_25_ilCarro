package com.ilcarro.qa;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {
    //preconditions: user should be logged out
    @BeforeMethod
    public void ensurePreconditions(){
        if (app.getHeader().isSignUpTabPresentInHeader()){   //sing up not present
            app.user.logOut();   //click on Input button
        }
    }

    @Test
    public void testSignUp() throws InterruptedException {

        //click on SignUp button
        app.getUser().openRegistrationFormFromHeader();
        Assert.assertTrue(app.user.isRegistrationFormOpened());

        //fill registration form
        app.user.fillRegistrationForm(new User()
                .withFirstName("AD")
                .withSecondName("RV")
                .withEmail("qwertyu15@gmail.com")
                .withPassword("Qwerty12345"));

        app.getUser().selectPolicyCheckBox();

        app.getCar().pause(2000);
        app.getCar().clickSubmitButton();

        //check login form displayed
        Assert.assertTrue(app.getUser().isLoginFormPresent());
    }


}
