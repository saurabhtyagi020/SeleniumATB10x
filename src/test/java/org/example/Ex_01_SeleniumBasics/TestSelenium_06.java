package org.example.Ex_01_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_06 {

    @Test
    public void test_Selenium06()
    {
        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        String pageSource=driver.getPageSource();
        if(pageSource.contains("CURA Healthcare Service"))
        {
            Assert.assertTrue(true);
        }
        else
        {
            Assert.assertTrue(false);
        }

        driver.close();
    }
}
