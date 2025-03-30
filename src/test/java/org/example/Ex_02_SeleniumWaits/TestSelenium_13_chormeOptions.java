package org.example.Ex_02_SeleniumWaits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSelenium_13_chormeOptions {

    public static void main(String[] args) {

        ChromeOptions chromeOptions =  new ChromeOptions();
        chromeOptions.addArguments("--incognito");


        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.navigate().to("https://facebook.com");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       // driver.quit();
    }
}
