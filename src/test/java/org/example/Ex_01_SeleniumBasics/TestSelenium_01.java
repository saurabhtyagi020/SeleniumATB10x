package org.example.Ex_01_SeleniumBasics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium_01 {

    @Test
    public void test_Sample()
    {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("file:///C:/Users/HP/Downloads/index.html");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
