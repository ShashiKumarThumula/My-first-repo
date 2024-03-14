package Keka_project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class KekaProject_TestNg {

    WebDriver driver;
    KekaProject_TestNg kp = new KekaProject_TestNg();
    @BeforeMethod
    public void KekaLogin() throws InterruptedException {

       // System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(5000);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,300)");

        driver.get("https://app.keka.com/");
    }

    @AfterMethod
    public void Teardown() {
//        driver.quit();
 }
    @Test
    public void KekaMethod() throws InterruptedException, IOException, AWTException {

        KekaProject_TestNg kp=new KekaProject_TestNg();
        System.out.println("Shashi1");
        Thread.sleep(8000);
        System.out.println("Shashi2");

        driver.findElement(By.xpath("//label[text()='Email or Mobile']")).click();
        System.out.println("Shashi3");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[text()='Email or Mobile']")).sendKeys("shashit@adaps.com");

        driver.findElement(By.xpath("//button[text()='Continue']")).click();

        driver.findElement(By.xpath("//p[text()='Microsoft']")).click();

        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7659832728S@s");

        driver.findElement(By.id("idSIButton9")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@class='ki-home sidebar-list-icon']")).click(); // HOME

        Thread.sleep(3000);

        driver.findElement(By.xpath("(//a[@href='/#/me/leave'])[1]")).click(); // ME

        driver.findElement(By.xpath("(//span[normalize-space()='Attendance'])[1]")).click(); // ME-->attendance

        Thread.sleep(3000);


        driver.findElement(By.xpath("(//a[normalize-space()='Attendance Requests'])[1]")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[normalize-space()='Attendance Requests']")).
                click();

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");

        Thread.sleep(2000);

        File Src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);  // taking attendance screenshot using screenshot method

        FileUtils.copyFile(Src, new File("D:\\Selenium\\Screenshots\\RegularizationRequest.png"));

        driver.navigate().back();                    // navigate back

        driver.findElement(By.xpath("//a[@routerlink='inbox']")).click();   //clicking on inbox

        Thread.sleep(2000);

        String WebElement = driver.findElement(By.cssSelector("div[class='list-header'] label")).getText();          //NOTIFICATIONS

        if (WebElement.equals("PENDING TASKS")) {
            Thread.sleep(2000);

            driver.findElement(By.xpath("//button[@class='mt-20 btn btn-primary']")).click();

            driver.findElement(By.xpath("(//textarea[@placeholder='Write your answer here...'])[1]")).clear();
            driver.findElement(By.xpath("(//textarea[@placeholder='Write your answer here...'])[1]")).sendKeys("I would like to learn new technologies");

            Thread.sleep(1000);

            driver.findElement(By.xpath("(//textarea[@placeholder='Write your answer here...'])[2]")).clear();
            driver.findElement(By.xpath("(//textarea[@placeholder='Write your answer here...'])[2]")).sendKeys("My manager supported me in upskilling");

            Thread.sleep(1000);

            driver.findElement(By.xpath("(//textarea[@placeholder='Write your answer here...'])[3]")).clear();
            driver.findElement(By.xpath("(//textarea[@placeholder='Write your answer here...'])[3]")).sendKeys("I have learnt Java selenium");

            Thread.sleep(1000);

            driver.findElement(By.xpath("(//textarea[@placeholder='Write your answer here...'])[4]")).clear();
            driver.findElement(By.xpath("(//textarea[@placeholder='Write your answer here...'])[4]")).sendKeys("Punctuality");
            ;
            Thread.sleep(1000);

            driver.findElement(By.xpath("(//span[@type=\"button\"])[20]")).click();

            Thread.sleep(1000);

            driver.findElement(By.xpath("//button[@class='btn btn-link mr-10 ng-star-inserted']")).click();

            Thread.sleep(2000);

            driver.navigate().back();
        } else {
            System.out.println("No issue with execution");
        }

        driver.findElement(By.xpath("//a[@routerlink='myteam/summary']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='View Employees']")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("download-menu")).click();

        WebElement WFH = driver.findElement(By.xpath("//a[text()='Download Pdf']"));    //DOWNLOADING PDF

        WFH.click();

        Path sourcePath = Paths.get("C:\\Users\\AIN190\\Downloads\\On Time Employees - Adaps IT Private Limited.pdf");

//        Assert.assertTrue(true, "No issue");

        Path destinationPath = Paths.get("D:\\Selenium\\downloadedDocuments", sourcePath.getFileName().toString());

        Files.copy(sourcePath, destinationPath);

        System.out.println("Please find Early arrivals list in folder");

        driver.navigate().back();

        driver.findElement(By.xpath("(//a[@routerlink='myfinances/summary'])[1]")).click();   // MY FINANCES

        driver.findElement(By.xpath("(//a)[25]")).click();

        driver.findElement(By.xpath("//span[@class='ki ki-close']")).click();

        Robot r = new Robot();
        for (int i = 0; i < 3; i++) {
            r.keyPress(KeyEvent.VK_CONTROL);
            r.keyPress(KeyEvent.VK_SUBTRACT);        // ZOOM OUT
            r.keyRelease(KeyEvent.VK_SUBTRACT);
            r.keyRelease(KeyEvent.VK_CONTROL);
        }

        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,170)");

        Thread.sleep(2000);

        driver.findElement(By.xpath("(//span[@class='ki-eye ki cursor-pointer ng-star-inserted'])[1]")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("(//span[@class='ki-eye ki cursor-pointer ng-star-inserted'])[2]")).click();

        WebElement PartialSs = driver.findElement(By.xpath("(//div[@class=\"card-body clear-padding on-hover-icon\"])[3]"));

        Thread.sleep(2000);

        File Details = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(Details, new File("D:\\Selenium\\Screenshots\\Aadhardetails.png"));

        driver.navigate().back();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[@class='ki-org sidebar-list-icon']")).click();

        driver.findElement(By.xpath("(//a[@class='ng-star-inserted'])[1]")).click();

        driver.findElement(By.xpath("(//input[@type='text'])[1]"));
    }


    public static Object with(By tagName) {
        return null;
    }
}