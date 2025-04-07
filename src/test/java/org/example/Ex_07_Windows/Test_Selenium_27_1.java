package org.example.Ex_07_Windows;

import org.example.TestBolierOpenClose;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class Test_Selenium_27_1 extends TestBolierOpenClose {

    @Test
    public void windowHandle() {

        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        String parent =driver.getWindowHandle();

        WebElement clickHere=driver.findElement(By.xpath("//a[@href='/windows/new']"));
        clickHere.click();

        Set <String> windowhandles= driver.getWindowHandles();
        System.out.println(windowhandles);
        for (String handle:windowhandles)
        {
            if (handle.contains("New window"))
            {
                System.out.println("Passed");
            }
        }
        driver.switchTo().window(parent);




    }
}
