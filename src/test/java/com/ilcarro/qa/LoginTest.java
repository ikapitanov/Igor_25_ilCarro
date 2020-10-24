package com.ilcarro.qa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
    @BeforeMethod
    public void ensurePreconditions(){
        //goTo login page
        if (!isLoginFormPresent()){
            //if user logged in, click logout, after go to login
            if (isUserLoggedIn()){
                logOut();
            }
            clickLogInTabOnHeader();
        }
    }

    @Test
    public void loginRegisteredUserPositiveTest(){
        //qwertyu@gmail.com
        //qwertyu2@gmail.com
        //qwertyu4@gmail.com"
        //"qwertyu5@gmail.com"
        //"qwertyu6@gmail.com"
        //"qwertyu7@gmail.com"
        //"qwertyu7@gmail.com"
        //"qwertyu8@gmail.com"
        //"qwertyu10@gmail.com"
        //"qwertyu11@gmail.com"
        //"qwertyu12@gmail.com"
        //"qwertyu13@gmail.com"
        //"qwertyu14@gmail.com"


        //fill login form
        fillLoginForm(new User().withEmail("qwertyu2@gmail.com").withPassword("Qwerty12345"));

        //submit login
        clickSubmitButton();

        //Assert user logged in
        Assert.assertTrue(isUserLoggedIn());
        String email = getEmailFromHeader();
        System.out.println(email);
        Assert.assertEquals(email, "qwertyu2@gmail.com");
    }

}
