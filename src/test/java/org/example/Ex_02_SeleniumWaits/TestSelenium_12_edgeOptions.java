package org.example.Ex_02_SeleniumWaits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSelenium_12_edgeOptions {

    @Test
    public void testOptions_selenium()
    {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://facebook.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.quit();

    }
}
