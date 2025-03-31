package org.example.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class ApplitToolsAutomate {

    @Test

    public void test_total_amount() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.applitools.com");

        WebElement user_name=driver.findElement(By.id("username"));
        user_name.sendKeys("Admin");

        WebElement user_password = driver.findElement(By.id("password"));
        user_password.sendKeys("Password@123");

        driver.findElement(By.id("log-in")).click();

       List<WebElement> amount_elements=driver.findElements(By.xpath("//span[@class='text-success']"));

        double receive_totalAmount = 0;
        double neg_receive_totalAmount = 0;
        double totalAmount=0;

        for (WebElement amountElement : amount_elements) {
            String amountText = amountElement.getText().trim();

            amountText = amountText.replace(",", "").replace("+", "").replace("USD", "").trim();

                double amount = Double.parseDouble(amountText);
                receive_totalAmount = receive_totalAmount+amount;
        }

        List<WebElement> negative_elements=driver.findElements(By.xpath("//span[@class='text-danger']"));
        for(WebElement negative_element:negative_elements)
        {
            String amountText = negative_element.getText().trim();
            amountText = amountText.replace(",", "").replace("-", "").replace("USD", "").trim();

                double amount = Double.parseDouble(amountText);
                neg_receive_totalAmount = neg_receive_totalAmount+amount;

        }
            totalAmount = receive_totalAmount-neg_receive_totalAmount;
        System.out.println("Total Recent Transaction Amount: " + totalAmount + " USD");
        driver.quit();
        }

    }

