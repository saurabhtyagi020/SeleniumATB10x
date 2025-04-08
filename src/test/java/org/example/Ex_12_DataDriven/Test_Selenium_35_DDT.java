package org.example.Ex_12_DataDriven;

import org.example.TestBolierOpenClose;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_Selenium_35_DDT {


    @Test(dataProvider = "getdata")
    public void test_login(String email,String password)
    {
        System.out.println(email + " ||| "+password);
    }

    @DataProvider
    public Object[][] getdata()
    {
        return new Object[][]{
                new Object[]{"admin@gmail.com","123"},
                new Object[]{"admin1@gmail.com","123"},
                new Object[]{"admin1@gmail.com","123"},
                new Object[]{"admin1@gmail.com","123"}

        };

    }
}
