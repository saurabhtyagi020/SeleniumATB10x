package org.example.Ex_07_Windows;

import org.example.TestBolierOpenClose;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class Test_Selenium_27 extends TestBolierOpenClose {

    @Test
    public void windowHandle()
    {

        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();
        WebElement clickHere=driver.findElement(By.xpath("//a[@href='/windows/new']"));
        clickHere.click();

        Set<String> tabs = driver.getWindowHandles();
        for(String tab:tabs) {
            driver.switchTo().window(tab);
            if(driver.getPageSource().contains("New window"))
            {
                System.out.println("Test case passed");
            }
        }

    }
}
