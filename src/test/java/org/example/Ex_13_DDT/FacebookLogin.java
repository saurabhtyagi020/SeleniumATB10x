package org.example.Ex_13_DDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class FacebookLogin {

    WebDriver driver;
    @BeforeTest
    public void openBrowser()
    {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Test(dataProvider = "getdata")
    public void login(String email,String password)
    {
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(password);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='login']")));
        driver.findElement(By.xpath("//button[@name='login']")).click();

    }

    @DataProvider
    public Object[][] getdata()
    {

        return ExcelUtil.getDatafromexcel("sheet1");
    }
    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
