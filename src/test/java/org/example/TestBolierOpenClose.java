package org.example;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBolierOpenClose {


    public WebDriver driver;
    @BeforeTest
    public  void openBrowser()
    {
        driver= new EdgeDriver();
        driver.manage().window().maximize();
    }


    @AfterTest
    public void closeBrowser()
    {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
      driver.quit();
    }
}
