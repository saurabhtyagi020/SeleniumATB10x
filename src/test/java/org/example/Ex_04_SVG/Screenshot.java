package org.example.Ex_04_SVG;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

public class Screenshot {

    @Test
  public void flip() throws IOException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/search");


        WebElement search_txt_box = driver.findElement(By.xpath("//input[@name='q']"));
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

        String timestamp = new SimpleDateFormat("_yyyyMMdd_hhmmss").format(new Date());
        String imgName = "IMG"+timestamp+".png";
        //TakesScreenshot ts = (TakesScreenshot)driver;

        File src = search_txt_box.getScreenshotAs(OutputType.FILE);

       // File dest = new File("D:\\APIAutomation\\SeleniumATB10x\\Screenshot");
        FileUtils.copyFile(src, new File("D:\\APIAutomation\\SeleniumATB10x\\Screenshot\\"+imgName) );
    }
}
