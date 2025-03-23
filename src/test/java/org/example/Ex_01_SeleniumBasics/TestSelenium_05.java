package org.example.Ex_01_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium_05 {

    @Test
    public void test_Selenium05()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        System.out.println(driver.getPageSource());
        driver.close();
    }
}
