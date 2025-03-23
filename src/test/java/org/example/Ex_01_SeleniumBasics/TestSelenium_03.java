package org.example.Ex_01_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium_03 {

    @Test
    public void test_Selenium03()
    {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");
    }
}
