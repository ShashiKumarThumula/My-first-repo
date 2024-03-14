package Practice_programs;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOCATORS2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name="Rahul";
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String Password=getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);//css
		driver.findElement(By.cssSelector("input[type*='password']")).sendKeys(Password);
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText());
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgot your password?")).click();//<a> denotes link
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String passwordtext=driver.findElement(By.cssSelector("form p")).getText();
		//please use temporary password 'rahulshettyacademy' to login 
		String[] PasswordArray=passwordtext.split("'");
//		String[]PasswordArray2=PasswordArray[1].split("'");
//		PasswordArray2[0]
		
		String Password=PasswordArray[1].split("'")[0];
		return Password;

	}
}
