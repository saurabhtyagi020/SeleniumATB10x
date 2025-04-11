package org.example.Ex_07_Windows;

import org.example.TestBolierOpenClose;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

public class Test_Selenium_27_GetWindow extends TestBolierOpenClose {

    @Test
    public void windowHandle()
    {

        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();
        WebElement clickHere=driver.findElement(By.xpath("//a[@href='/windows/new']"));
        clickHere.click();

        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println("Title():"+ driver.getTitle());
    }
}
