package org.example.Ex_11_Web_tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Webtable_02 {

    @Test
    public void tableData() {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        driver.findElement(By.id("login-username")).sendKeys("admin");
        driver.findElement(By.id("login-password")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@value='LOG IN']")).click();

        driver.findElement(By.xpath("//a[contains(text(),'Add Sales')]")).click();

        driver.findElement(By.xpath("//a[contains(text(),'View Sales')]")).click();

        int row = driver.findElements(By.xpath("//table/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table/tbody/tr[2]/td")).size();

        String first_part = "//table/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";

        System.out.println(row);
        System.out.println(col);

        for (int i = 2; i <row ; i++) {

            for (int j = 1; j <col ; j++) {
                String dynamicpath= first_part+i+second_part+j+third_part;

                String data = driver.findElement(By.xpath(dynamicpath)).getText();
                System.out.println(data);

            }
        }
    }
}
