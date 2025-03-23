package org.example.Task;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_09_T1 {

    @Description("Verify katalon url after login")
    @Test
    public void test_Selenium09()
    {
        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("btn-make-appointment")).click();

        driver.findElement(By.id("txt-username")).sendKeys("John Doe");
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.id("btn-login")).click();


        String cUrl=driver.getCurrentUrl();
        Assert.assertEquals(cUrl,"https://katalon-demo-cura.herokuapp.com/#appointment");
        driver.quit();




    }

}
