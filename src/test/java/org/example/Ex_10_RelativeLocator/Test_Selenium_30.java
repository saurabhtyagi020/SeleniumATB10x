package org.example.Ex_10_RelativeLocator;

import org.example.TestBolierOpenClose;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.*;


public class Test_Selenium_30 extends TestBolierOpenClose {

    @Test
    public void relativeLoacator()
    {
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement year_of_exp=driver.findElement(By.xpath("//span[contains(normalize-space(),'Years of Experience')]"));

        WebElement exp3=driver.findElement(with(By.id("exp-3")).toRightOf(year_of_exp));
        exp3.click();


    }
}
