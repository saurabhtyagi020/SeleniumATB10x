package org.example.Ex_10_RelativeLocator;

import org.example.TestBolierOpenClose;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Test_Selenium_31 extends TestBolierOpenClose {

    @Test
    public void relative_2()
    {
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();

        WebElement frameresult=driver.findElement(By.xpath("//iframe[@id='result']"));
        driver.switchTo().frame(frameresult);
        driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();

        WebElement userTxtbox=driver.findElement(By.id("username"));
        WebElement userValidationmsg=driver.findElement(with(By.xpath("//small[contains(text(),'Username must be at least 3 characters')]")).below(userTxtbox));
        System.out.println(userValidationmsg.getText());
    }
}
