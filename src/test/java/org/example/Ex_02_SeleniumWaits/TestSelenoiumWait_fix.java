package org.example.Ex_02_SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenoiumWait_fix {


    // Locators - Find the Web elements
    // Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
    //Find the Email id** and enter the email as admin@admin.com
    //Find the pass inputbox** and enter passwrod as admin.
    //Find and Click on the submit button
    //Verify that the error message is shown "Your email, password, IP address or location did not match"

    @Test
    public void test_seleniumWait()
    {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");

        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[@id='js-login-btn']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Your email, password, IP address or location did not match']")));

        WebElement error_txt_msg = driver.findElement(By.xpath("//div[text()='Your email, password, IP address or location did not match']"));
        String error =error_txt_msg.getText();

        Assert.assertEquals(error,"Your email, password, IP address or location did not match");



    }
}
