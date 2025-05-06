package org.example.Ex_15_WebtableDDT;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateTable {


    WebDriver driver;
    @BeforeTest
    public void openBrowser()
    {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Test(dataProvider="getdata")
    public void createTable(String fname,String lname,String email,String age, String salary,String dept)
    {
        driver.get("https://demoqa.com/webtables");
        WebElement add=driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);",add);

        for(int i=1;i<5;i++) {

            add.click();
            driver.findElement(By.id("firstName")).sendKeys(fname);
            driver.findElement(By.id("lastName")).sendKeys(lname);
            driver.findElement(By.id("userEmail")).sendKeys(email);
            driver.findElement(By.id("age")).sendKeys(age);
            driver.findElement(By.id("salary")).sendKeys(salary);
            driver.findElement(By.id("department")).sendKeys(dept);
            driver.findElement(By.id("submit")).click();

        }


    }


    @DataProvider
    public Object[][] getdata()
    {

        return ExcelUtil.getDatafromexcel("sheet1");
    }
}
