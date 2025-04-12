package org.example.Ex_07_Windows;

import org.example.TestBolierOpenClose;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Test_Selenium_28_All_GetWInodow extends TestBolierOpenClose
{
    @Test
    public void mini_project() throws InterruptedException {
        driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");
        List<WebElement> heatmaps =driver.findElements(By.xpath("//img[@data-qa='danawobuqa']"));

        String parentwindow=driver.getWindowHandle();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        List<WebElement> visibleElements=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//img[@data-qa='danawobuqa']")));

        Actions actions = new Actions(driver);
        actions.moveToElement(heatmaps.get(1)).click().build().perform();

//       Set<String> windowHandles =driver.getWindowHandles();
//       for(String windowHandle:windowHandles)
//       {
//           if (!windowHandle.equals(parentwindow))
//           {
//               driver.switchTo().window(windowHandle);
//              WebElement iframe=driver.findElement(By.id("heatmap-iframe"));
//              driver.switchTo().frame(iframe);
//
//               wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("heatmap-iframe")));
//               driver.findElement(By.xpath("//div[@data-qa='liqokuxuba']")).click();
//               driver.switchTo().defaultContent();
//           }
//       }

        Thread.sleep(5000);
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(1));
//              WebElement iframe=driver.findElement(By.id("heatmap-iframe"));
//              driver.switchTo().frame(iframe);
//
//               wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("heatmap-iframe")));
//               driver.findElement(By.xpath("//div[@data-qa='liqokuxuba']")).click();
               System.out.println("title: "+ driver.getTitle());
               driver.switchTo().defaultContent();



    }

}
