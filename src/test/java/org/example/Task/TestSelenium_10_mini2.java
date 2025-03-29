package org.example.Task;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_10_mini2 {

    @Owner("Saurabh Tyagi")
    @Description("Verify that invalid email give the error on signup")
    @Test
    public void test_AppVwo() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/");

        WebElement free_trial=driver.findElement(By.xpath("//a[text()='Start a free trial']"));
        free_trial.click();
        
        Thread.sleep(3000);

        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));








        driver.quit();


    }
}
