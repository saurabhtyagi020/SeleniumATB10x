package org.example.Ex_01_SeleniumBasics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium_01 {

    @Test
    public void test_Sample()
    {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        driver.quit();
    }
}
