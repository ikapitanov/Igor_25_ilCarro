package com.ilcarro.qa;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SearchTest extends TestBase {

    @Test
    public void isSearchPresent(){
        openSearchFromHeader();
        System.out.println(getTextFromSearchHeader());
    }


}
