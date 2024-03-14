package Keka_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");

        // Create ChromeOptions instance
        ChromeOptions options = new ChromeOptions();

        // Enable incognito mode
        options.addArguments("incognito");

        // Initialize WebDriver with ChromeOptions
        WebDriver driver = new ChromeDriver(options);

        // Now, navigate to a website
        driver.get("https://www.pega.com/");

        driver.manage().window().maximize();
    }
}