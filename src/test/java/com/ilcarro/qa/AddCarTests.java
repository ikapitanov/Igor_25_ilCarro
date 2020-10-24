package com.ilcarro.qa;

import org.testng.annotations.Test;

public class AddCarTests extends TestBase{

    @Test
    public void testFormLetTheCarWorkForLoggedInUser() throws InterruptedException{
        if (!isUserLoggedIn()){
            logIn();
        }

        openAddCarFormFromHeader();

        fillCarForm(
                 new Car().setCountry("Israel").setAddress("Balfour Street").setDistanceIncluded("500")
                 .setSerialNumber("12345678").setBrand("Toyota").setModel("Corolla").setYear("2010")
                 .setEngine("2.0").setFuelConsumption("8").setFuel("petrol").setTransmition("automatic")
                 .setWd("wedfrt").setHorsepower("140").setTorque("3456").setDoors("4").setSeats( "5").setClasss("E")
                 .setAbout("gwigefogwofg").setTypeFeature("mncblsan").setPrice("90"));

         clickSubmitButton();
    }

    @Test
    public void testFormLetTheCarWorkForNotLoggedInUser() throws InterruptedException{
        if (isUserLoggedIn()){
            logOut();
        }

        openAddCarFormFromHeader();

        fillCarForm(
                new Car().setCountry("Israel").setAddress("Balfour Street").setDistanceIncluded("500")
                        .setSerialNumber("12345678").setBrand("Toyota").setModel("Corolla").setYear("2010")
                        .setEngine("2.0").setFuelConsumption("8").setFuel("petrol").setTransmition("automatic")
                        .setWd("wedfrt").setHorsepower("140").setTorque("3456").setDoors("4").setSeats( "5").setClasss("E")
                        .setAbout("gwigefogwofg").setTypeFeature("mncblsan").setPrice("90"));

        clickSubmitButton();
    }

    @Test
    public void NegativeTestAddCarWithoutDorsInfo(){
        openAddCarFormFromHeader();

        fillCarForm(
                new Car().setCountry("Israel").setAddress("Balfour Street").setDistanceIncluded("500")
                        .setSerialNumber("12345678").setBrand("Toyota").setModel("Corolla").setYear("2010")
                        .setEngine("2.0").setFuelConsumption("8").setFuel("petrol").setTransmition("automatic")
                        .setWd("wedfrt").setHorsepower("140").setTorque("3456").setSeats( "5").setClasss("E")
                        .setAbout("gwigefogwofg").setTypeFeature("mncblsan").setPrice("90"));

        clickSubmitButton();
    }

}
