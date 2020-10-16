package com.ilcarro.qa;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TermsOfUseTest extends TestBase {

    @Test
    public void isTermsOfUsePresent(){
        wd.findElement(By.cssSelector("[href='/terms']")).click();
        System.out.println(wd.findElement(By.cssSelector("#root")).getText());
    }

    @AfterMethod (enabled = false)
    public void tearDown(){
        wd.quit();
    }
}
