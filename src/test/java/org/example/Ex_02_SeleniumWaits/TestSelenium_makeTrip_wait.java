package org.example.Ex_02_SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium_makeTrip_wait {


    @Test
    public void test_Selenium_mmt()
    {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@data-cy='closeModal']")));

        driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement one_way_element=driver.findElement(By.xpath("//li[@data-cy=\"oneWayTrip\"]"));
        String txt_one_way=one_way_element.getText();

        Assert.assertEquals(txt_one_way,"One Way");

        driver.quit();

    }
}
