package Keka_project;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Keka_Captcha{
    public static void main(String[] args) throws InterruptedException, IOException, AWTException {
        System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,300)");

        driver.get("https://app.keka.com/");

        driver.manage().window().maximize();

        driver.findElement(By.id("email")).sendKeys("shashit@adaps.com");

        driver.findElement(By.xpath("//button[text()='Continue']")).click();
    }
}

