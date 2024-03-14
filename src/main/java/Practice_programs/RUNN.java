package Practice_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RUNN {

	public static void main(String[] args) throws InterruptedException {
	String Username="shashit@adaps.com";
	String Password="7659832728S@s";
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.runn.io/users/sign_in");
		driver.findElement(By.cssSelector("input#user_email")).sendKeys(Username);
		driver.findElement(By.name("user[password]")).sendKeys(Password);
		driver.findElement(By.name("commit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Edit Timesheet']")).click();
		driver.findElement(By.xpath("//input[@class='tc Input-module__input___Os6f1 ActualsTable-module__input___ZwGO6 ActualsTable-module__inputWarning___zGy7X']")).clear();
		driver.findElement(By.xpath("//input[@class='tc Input-module__input___Os6f1 ActualsTable-module__input___ZwGO6 ActualsTable-module__inputWarning___zGy7X']")).sendKeys("8");


	}

}
