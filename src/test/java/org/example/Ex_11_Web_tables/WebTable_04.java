package org.example.Ex_11_Web_tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class WebTable_04 {

    @Test
    public void dataTable()
    {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/webtable.html");

        WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));

        //Row and columns
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for (int i = 0; i <rows.size() ; i++) {

           List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
            for(WebElement col:cols)
            {
                //System.out.println(col.getText());
                if(col.getText().contains("Yoshi Tannamuri"))
                {
                    System.out.println(col.getText());


                }
            }

        }







    }
}
