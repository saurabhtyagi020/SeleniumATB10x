package org.example.Ex_11_Web_tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class WebTable01 {

    @Test
    public void staticTable()
    {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/webtable.html");

        // xpath= //table[@id='customers']/tbody/tr[2]/td[1]

        String firstpart= "//table[@id='customers']/tbody/tr[";
        String secondpart = "]/td[";
        String thirdpart = "]";

       int row=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
       int col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();

        System.out.println("Row="+row);
        System.out.println("col="+col);

        for (int i = 2; i <=row ; i++) {

            for (int j = 1; j <=col ; j++) {

                String dynamicxpath=firstpart+i+secondpart+j+thirdpart;
              //  System.out.println("table="+dynamicxpath);

                String data=driver.findElement(By.xpath(dynamicxpath)).getText();
                System.out.println(data);
                if (data.contains("Giovanni Rovelli"))
                {
                    String country_path=dynamicxpath+"/following-sibling::td";
                    String country_name=driver.findElement(By.xpath(country_path)).getText();
                    System.out.println("Countrt="+country_name);
                }
            }
        }
            driver.quit();
    }
}
