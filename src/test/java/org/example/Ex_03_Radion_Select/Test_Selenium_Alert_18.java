package org.example.Ex_03_Radion_Select;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.TestRunner;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test_Selenium_Alert_18 {

    @Test
    public void test_alert(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("saurabh");
        alert.accept();

       String result =driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result,"You entered: saurabh");

        driver.quit();

    }
}
