package org.example.Ex_10_RelativeLocator;

import org.checkerframework.checker.units.qual.A;
import org.example.TestBolierOpenClose;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.security.Key;
import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Test_Selenium_32 extends TestBolierOpenClose {

    @Test
    public void relative_3() {
        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search']")));

        WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        actions.moveToElement(search).sendKeys("india" + Keys.ENTER);

        List<WebElement> locations = driver.findElements(By.cssSelector("div.location-name > p"));
        for (WebElement location : locations) {

            String rank = driver.findElement(with(By.tagName("p")).toLeftOf(location)).getText();
            String aqi = driver.findElement(with(By.tagName("span")).toRightOf(location)).getText();
            System.out.println(rank + "||||" + aqi);
            System.out.println("=========================");
            System.out.println("| +" + rank + " | " + location.getText() + " | " + aqi + " | ");


        }
    }
}
