package org.example.Ex_08_JavaScriptexecutor;

import org.example.TestBolierOpenClose;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test_Selenium_29 extends TestBolierOpenClose {

    @Test
    public void test_js()
    {
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();
        WebElement guides=driver.findElement(By.xpath("//h2[normalize-space()='Guides']"));

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",guides);

        System.out.println(guides.getText());
    }
}
