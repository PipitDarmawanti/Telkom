package sauslabs;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TcSauslabs {
    WebDriver driver;
    @Test(priority = 0, description="Success Daftar Scenario")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test Description: Success Daftar")
    void Daftar() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://DRIVER/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000);

        driver.navigate().refresh();
    }
}