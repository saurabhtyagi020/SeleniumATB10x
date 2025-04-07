package org.example.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Task_5Apr {

    @Test
    public void test_selenium()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app-automate.browserstack.com");
        driver.manage().window().maximize();

        WebElement businessMail=driver.findElement(By.id("user_email_login"));
        businessMail.sendKeys("saurabhtyagi1@rediffmail.com");

        WebElement mailPass=driver.findElement(By.id("user_password"));
        mailPass.sendKeys("Test@1234");


        driver.findElement(By.id("user_submit")).click();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//
//       WebElement uploadButton=driver.findElement(By.xpath("//span[@class='aa-app-uploader__upload-text align-self-center']"));
//
//        String working_dir = System.getProperty("user.dir");
//        System.out.println(working_dir);
//
//        uploadButton.sendKeys(working_dir+"/src/test/java/org/example/testdroid-sample-app.apk");



       // driver.quit();
    }


}
