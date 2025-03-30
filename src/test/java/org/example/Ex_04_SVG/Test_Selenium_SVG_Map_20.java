package org.example.Ex_04_SVG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Test_Selenium_SVG_Map_20 {

    @Test
    public void test_map_svg()
    {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amcharts.com/svg-maps/?map=india");


        List< WebElement> states =driver.findElements(By.xpath("//*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g']/*[name()='path']"));
        for(WebElement State : states)
        {
          //  System.out.println(allStates);
            System.out.println(State.getDomAttribute("aria-label"));
//            if(State.getDomAttribute("aria-label").contains("Punjab"))
//            {
//                State.click();
//            }

        }

    }

}
