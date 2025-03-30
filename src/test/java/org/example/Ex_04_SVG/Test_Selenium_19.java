package org.example.Ex_04_SVG;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Test_Selenium_19 {

    @Description("Verify that the on search with svg icon results are visible.")
    @Test
    public void test_selenium()
    {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/search");

        WebElement search_txt_box=driver.findElement(By.xpath("//input[@name='q']"));
        search_txt_box.sendKeys("iphone");

        List<WebElement> search_svg_icon = driver.findElements(By.xpath("//*[name()='svg']"));
        search_svg_icon.get(0).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@data-id,'MOB')]")));

        List<WebElement> iphone=driver.findElements(By.xpath("//div[contains(@data-id,'MOB')]"));

        for(WebElement title :iphone)
        {
            System.out.println(title.getText());
        }

    }
}
