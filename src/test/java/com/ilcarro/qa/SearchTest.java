package com.ilcarro.qa;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SearchTest extends TestBase {

    @Test
    public void isSearchPresent(){
    wd.findElement(By.cssSelector("[href='/search']")).click();
    System.out.println(wd.findElement(By.xpath("//h3[contains(text(),'Find your car now!')]")).getText());
    }

    @AfterMethod (enabled = false)
    public void tearDown(){
        wd.quit();
    }
}
