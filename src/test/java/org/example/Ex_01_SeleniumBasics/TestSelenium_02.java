package org.example.Ex_01_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestSelenium_02
{
    @Description("Open the app.vwo.com and verify the title")
    @Test
    public void test_Selenium_02()
    {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        String appVWotitle = driver.getTitle();
        String currentUrl=driver.getCurrentUrl();
        Assert.assertEquals(appVWotitle,"Login - VWO");
        assertThat(currentUrl).isNotNull().isEqualTo("https://app.vwo.com/#/login");
        driver.quit();
    }
}
