package org.example.Ex_03_Radion_Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Selenium_16 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.findElement(By.id("exp-2")).click();

        driver.findElement(By.id("profession-1")).click();
    }
}
