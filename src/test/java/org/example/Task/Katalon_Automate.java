package org.example.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Katalon_Automate {

    @Test
    public void test_katalon() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        driver.findElement(By.id("btn-make-appointment")).click();

        driver.findElement(By.id("txt-username")).sendKeys("John Doe");
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.id("btn-login")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("combo_facility")));
        WebElement dropdown=driver.findElement(By.id("combo_facility"));

        Select select = new Select(dropdown);
        select.selectByValue("Hongkong CURA Healthcare Center");



        driver.findElement(By.id("radio_program_none")).click();

        WebElement visit_date =driver.findElement(By.id("txt_visit_date"));
        visit_date.sendKeys("30/03/2025");

        driver.findElement(By.id("txt_comment")).sendKeys("ABC");

        driver.findElement(By.id("btn-book-appointment")).click();

        String comment_txt=driver.findElement(By.id("comment")).getText();

        Assert.assertEquals(comment_txt,"ABC");

        driver.findElement(By.id("menu-toggle")).click();

        driver.findElement(By.xpath("//a[text()='Logout']")).click();

        driver.quit();
    }
}
