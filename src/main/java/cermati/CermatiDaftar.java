package cermati;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CermatiDaftar {
    WebDriver driver;
    @Test(priority = 0, description="Success Daftar Scenario")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test Description: Success Daftar")
    void Daftar() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://DRIVER/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.cermati.com/app/gabung");
        Thread.sleep(3000);

        driver.navigate().refresh();
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"safe-area\"]/header/div/div[1]/a/div/img"));
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("darmawanti99@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("mobilePhone")).sendKeys("081210064111");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("PasswordAku2233*");
        Thread.sleep(2000);
        driver.findElement(By.id("confirmPassword")).sendKeys("PasswordAku2233*");
        Thread.sleep(2000);
        driver.findElement(By.id("firstName")).sendKeys("Pipit");
        Thread.sleep(2000);
        driver.findElement(By.id("lastName")).sendKeys("Darmawanti");
        Thread.sleep(2000);
        driver.findElement(By.id("cityAndProvince")).sendKeys("Bogor");
        Thread.sleep(2000);
        driver.findElement(By.id("cityAndProvince")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"safe-area\"]/div[2]/div[2]/div/button/p")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"safe-area\"]/div[2]/div[2]/div[3]/div/footer/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("Qwerty7990@!%");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"safe-area\"]/div[2]/div[2]/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"safe-area\"]/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/div[2]/button[1]/div[1]/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"main-navigation\"]/ul[1]/li[4]/a")).click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)", "");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-1200)", "");
        Thread.sleep(2000);
        driver.findElement(By.id("overview-header")).click();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(2000);
        driver.findElement(By.id("pengertian-header")).click();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-500)", "");
        Thread.sleep(2000);
        driver.findElement(By.id("sejarah-header")).click();
        js.executeScript("window.scrollBy(0,100)", "");
        Thread.sleep(2000);
        driver.findElement(By.id("keuntungan-header")).click();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,400)", "");
        Thread.sleep(2000);
        driver.findElement(By.id("keamanan-header")).click();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,500)", "");
        driver.findElement(By.id("providerlain-header")).click();
        Thread.sleep(2000);
    }
    @AfterMethod
    void tearDown()
    {
        driver.quit();
    }
}