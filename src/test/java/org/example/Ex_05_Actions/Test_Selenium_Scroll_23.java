package org.example.Ex_05_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test_Selenium_Scroll_23 {

    @Test
    public void scroll_page()
    {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");

        WebElement student = driver.findElement(By.xpath("//div[text()='Students']"));
        Actions actions = new Actions(driver);
        student.click();

        WebElement join = driver.findElement(By.xpath("//div[text()='Join SpiceClub']"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Join SpiceClub']")));
        actions.scrollToElement(join).perform();
    }
}
