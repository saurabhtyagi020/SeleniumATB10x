package org.example.Ex_06_Fileupload;

import org.example.TestBolierOpenClose;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Test_Selenium_uploadfile_26 extends TestBolierOpenClose {


@Test
    public void uploadfile()
    {
        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();

        WebElement fileUpload=driver.findElement(By.id("uploadFile"));
        String dir=System.getProperty("user.dir");

        fileUpload.sendKeys(dir+"/src/test/java/org/example/testdroid-sample-app.apk");

        WebElement verifyText=driver.findElement(By.xpath("//p[@id='uploadedFilePath']"));
        String text=verifyText.getText();

//        if (text.contains("C:\\fakepath\\testdroid"))
//        {
//            System.out.println("fileupload successfully ");
//        }
//        else
//        {
//            System.out.println("Try again");
//        }
        if(driver.findElement(By.xpath("//p[@id='uploadedFilePath']")).isDisplayed()) {
            assertTrue(true, " Uploaded");
        }else {
            assertTrue(false, " not Uploaded");
        }
    }

    }

