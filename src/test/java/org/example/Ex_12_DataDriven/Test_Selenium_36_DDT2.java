package org.example.Ex_12_DataDriven;

import org.example.TestBolierOpenClose;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Test_Selenium_36_DDT2 {


    public EdgeDriver driver;

    @BeforeMethod
    public void openBrowser(){

       driver =new EdgeDriver();

    }


    @Test(dataProvider = "getData")
    public void test_vwo_login(String email,String password) throws InterruptedException {

        driver.get("https://app.vwo.com/#/login");

        driver.findElement(By.id("login-username")).sendKeys(email);
        driver.findElement(By.id("login-password")).sendKeys(password);
        driver.findElement(By.id("js-login-btn")).click();

        driver.findElement(By.id("login-username")).clear();
        driver.findElement(By.id("login-password")).clear();




        WebElement error_msg=driver.findElement(By.id("js-notification-box-msg"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-notification-box-msg")));

        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");

    }


    @DataProvider
    public Object[][] getData(){
        return UtilExcel.getDataFromExcel("sheet1");

    }


    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }


}
