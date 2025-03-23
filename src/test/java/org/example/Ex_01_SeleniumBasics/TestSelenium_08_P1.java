package org.example.Ex_01_SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_08_P1 {

            // Locators - Find the Web elements
// Open the URL https://app.vwo.com/#/login
// Find the Email id** and enter the email as **admin@admin.com**
// Find the Pass inputbox** and enter passwrod as **admin**.
// Find and Click on the submit button
// Verify that the error message is shown "Your email, password, IP address or location did not match"

    @Test
    public void test_Selenium08() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("login-username")).sendKeys("admin@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("1234");
        driver.findElement(By.id("js-login-btn")).click();
        Thread.sleep(3000);

        String textError = driver.findElement(By.className("notification-box-description")).getText();
        Assert.assertEquals(textError,"Your email, password, IP address or location did not match");
        driver.quit();
    }

}
