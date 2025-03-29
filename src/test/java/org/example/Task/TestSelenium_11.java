package org.example.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium_11 {

    @Test
    public void test_dynamic_xpath()
    {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        driver.findElement(By.xpath("//a[contains(text(),'Make')]"));

        //a[contains(text(),'Make')]
        //a[contains(@id,"btn-make-appointment")]

        //a[starts-with(text(),"Make")]

        //#### Operators - AND & OR

        //a[@id='btn-make-appointment' and contains(text(),'Make Appointment')]

        //a[@id='btn-make-appointment' or contains(text(),'Make Appointment')]

    }
}
