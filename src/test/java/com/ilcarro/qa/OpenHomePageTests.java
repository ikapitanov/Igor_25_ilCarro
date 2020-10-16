package com.ilcarro.qa;
import org.testng.annotations.Test;

public class OpenHomePageTests  extends TestBase{

    @Test
    public void homePageTest(){
        System.out.println("site opened");
       // wd.findElement(By.cssSelector(".Main_mainpage__find_your_car__AHLkw"));
        System.out.println("FindCarForm: " + isFindCarFormPresent());
        isFindCarFormPresent2();
    }


}



