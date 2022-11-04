package sauslabs;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestcaseSauslabs {
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
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("first-name")).sendKeys("pipit");
        Thread.sleep(2000);
        driver.findElement(By.id("last-name")).sendKeys("darmawanti");
        Thread.sleep(2000);
        driver.findElement(By.id("postal-code")).sendKeys("16770");
        Thread.sleep(2000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("finish")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("back-to-products")).click();
        Thread.sleep(2000);
    }


}