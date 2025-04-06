package org.example.Ex_05_Actions;

import org.example.TestBolierOpenClose;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test_Selenium_21 extends TestBolierOpenClose {

    @Test
    public void test_SpiceJet() {
        driver.get("https://www.spicejet.com/");

        WebElement from=driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(from).click().sendKeys("DEL").build().perform();

    }

}
