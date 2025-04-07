package org.example.Ex_06_Fileupload;

import org.example.TestBolierOpenClose;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test_Selenium_fileupload_25 extends TestBolierOpenClose {

    @Test
    public void uploadfile()
    {
        driver.get("https://awesomeqa.com/selenium/upload.html");

        WebElement upload=driver.findElement(By.id("fileToUpload"));

        String dir=System.getProperty("user.dir");
        System.out.println(dir);

        upload.sendKeys(dir+"/src/test/java/Test.txt");

        driver.findElement(By.name("submit")).click();
    }


}
