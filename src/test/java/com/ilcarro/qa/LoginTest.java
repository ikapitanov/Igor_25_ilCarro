package com.ilcarro.qa;

import org.openqa.selenium.By;
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
        //goTo login page
        clickLogInTabOnHeader();

        //fill login form
        type(By.name("email"), "qwertyu2@gmail.com");
        type(By.name("password"), "Qwerty12345");

        //submit login
        clickSubmitButton();

        //Assert userLoggedIn
    }
}
