package Practice_programs;

import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class eCON {
	 
		public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String EmailAddress="propertydeveloper1@yopmail.com";
			String Password="rules@123";
			driver.get("https://apps-uat.planningportal.nsw.gov.au/prweb/PRAuth/app/default/Cc0BJSdJ6OdBNUpuWBJD7zYCxcJRCjpn*/!STANDARD?");
			driver.findElement(By.xpath("//input[@id='signInName']")).sendKeys(EmailAddress);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
			driver.findElement(By.xpath("//button[@id='next']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[@id='appview-nav-toggle-one']")).click();
			driver.findElement(By.xpath("//a[@class='menu-item-anchor menu-item-expand']")).click();
			driver.findElement(By.xpath("//span[text()='Complying Development Certificate (New CDC, Mod)']")).click();
			Thread.sleep(3000);
			
			Robot r = new Robot();
	        for (int i = 0; i < 3; i++) {
	            r.keyPress(KeyEvent.VK_CONTROL);
	            r.keyPress(KeyEvent.VK_SUBTRACT);
	            
	            r.keyRelease(KeyEvent.VK_CONTROL);
	            r.keyRelease(KeyEvent.VK_SUBTRACT);
	            r.keyRelease(KeyEvent.VK_CONTROL);
	            r.keyRelease(KeyEvent.VK_SUBTRACT);
	        }
	            
//	     WebElement dropdElement=      driver.findElement(By.xpath("//select[@validationtype='calculateexpression']"));
//	     Select s=new Select(dropdElement);
//	     s.selectByVisibleText("Mrs");
	         Thread.sleep(4000);
	        driver.findElement(By.xpath("//input[@name='$PpyWorkPage$pApplicant$pPersonalInformation$pFirstName']")).sendKeys("rekha");
	            
		}
	 
	}
