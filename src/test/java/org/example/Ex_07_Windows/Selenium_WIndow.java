package org.example.Ex_07_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Selenium_WIndow {


    @Test
    public void window() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.findElement(By.xpath("//a[contains(text(),'SeleniumTutorial')]")).click();
        ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(3000);
        System.out.println("title: "+ driver.getTitle());
        driver.switchTo().window(tabs.get(0));



    }
}
