package org.example.Ex_03_Radion_Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_Selenium_17_Select {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropDown=driver.findElement(By.id("dropdown"));
        Select select = new Select(dropDown);
        select.selectByIndex(2);

        driver.quit();


    }
}
