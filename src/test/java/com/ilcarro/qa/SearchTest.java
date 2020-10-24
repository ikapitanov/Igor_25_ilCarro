package com.ilcarro.qa;

import org.testng.annotations.Test;

public class SearchTest extends TestBase {

    @Test
    public void isSearchPresent(){
        app.getHeader().openSearchFromHeader();
        System.out.println(app.getTextFromSearchHeader());
    }


}
