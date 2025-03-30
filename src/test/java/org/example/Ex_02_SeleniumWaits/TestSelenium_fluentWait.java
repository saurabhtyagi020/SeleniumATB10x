package org.example.Ex_02_SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium_fluentWait {

    @Test
    public void test_app_vwo()
    {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        // FindElement -> 1 element first web element
        // FindElements -> which can find multiple web elements

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.navigate().to("https://app.vwo.com");
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");


        // 1. Find the email inputbox and enter the email
        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");


        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("password@321");


        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

        Wait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(4))
                .ignoring(NoSuchElementException.class);

//        WebElement error_message = wait.until(new Function<WebDriver, WebElement>() {
//            @Override
//            public WebElement apply(WebDriver driver) {
//                return driver.findElement(By.xpath("//div[text()='Your email, password, IP address or location did not match']"));
//            }
//        });


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Your email, password, IP address or location did not match']")));

        WebElement error_txt_msg = driver.findElement(By.xpath("//div[text()='Your email, password, IP address or location did not match']"));
        String error =error_txt_msg.getText();

        Assert.assertEquals(error,"Your email, password, IP address or location did not match");






    }
}
