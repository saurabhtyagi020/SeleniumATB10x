package org.example.Ex_05_Actions;

import org.example.TestBolierOpenClose;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.security.PublicKey;
import java.time.Duration;
import java.util.List;

public class Test_MakeMyTrip_22 extends TestBolierOpenClose {

    @Test
    public void test_mmt() throws InterruptedException {
        String URL="https://www.makemytrip.com/";
        driver.get(URL);
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));

        WebElement closeModel=driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        closeModel.click();


        WebElement from=driver.findElement(By.xpath("//input[@data-cy='fromCity']"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-cy='fromCity']")));
        Actions actions = new Actions(driver);
        actions.moveToElement(from).click().sendKeys(from,"BOM").build().perform();


        List<WebElement> suggestion_list=driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));
        for (WebElement list :suggestion_list)
        {

            if(list.getText().contains("Chhatrapati"))
            {
                list.click();
            }

        }



    }
}
