package PRACTICE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowColumnAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);

		List<WebElement> Cols = driver.findElements(By.cssSelector(".table-display tr"));// cols xpath

		System.out.println("Col'count" + " :" + Cols.size()); // count of col's

		List<WebElement> Rows = driver.findElements(By.cssSelector(".table-display tr:nth-child(3) td"));

		System.out.println("Rows count" + " :" + Rows.size()); // count of row's

		System.out.println(driver.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText()); // text

	}
}
