package org.example.Ex_05_Actions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test_Selenium_20 {

    @Test
    public void test_Caps_selenium() throws IOException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/practice.html");

        WebElement firstName=driver.findElement(By.name("firstname"));

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys(firstName,"saurabh").keyUp(Keys.SHIFT).build().perform();

        String timestamp = new SimpleDateFormat("_yyyyMMdd_hhmmss").format(new Date());
        String imgName = "IMG"+timestamp+".png";
        //TakesScreenshot ts = (TakesScreenshot)driver;

        File src = firstName.getScreenshotAs(OutputType.FILE);

        // File dest = new File("D:\\APIAutomation\\SeleniumATB10x\\Screenshot");
        FileUtils.copyFile(src, new File("D:\\APIAutomation\\SeleniumATB10x\\Screenshot\\"+imgName) );
    }
}
