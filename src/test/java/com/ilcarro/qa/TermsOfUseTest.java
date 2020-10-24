package com.ilcarro.qa;

import org.testng.annotations.Test;

public class TermsOfUseTest extends TestBase {

    @Test
    public void isTermsOfUsePresent(String textFromTermsHeader){
        app.getHeader().openTermsFromHeader();
        System.out.println(textFromTermsHeader);
    }


}
