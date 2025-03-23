package org.example.Ex_01_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium_07 {
    @Test
    public void test_Selenium07()
    {
        WebDriver driver = new EdgeDriver();
        driver.get("http://google.com");
        driver.manage().window().maximize();
        driver.navigate().to("http://facebook.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();
    }
}
