package PRACTICE;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("Automa");
		Thread.sleep(3000);
		List<WebElement> Options =driver.findElements(By.cssSelector("li[class='sbct PZPZlf']"));
		for(WebElement Option:Options)
		{
			if(Option.getText().equalsIgnoreCase("automation testing tools"))
			{
				Option.click();
				break;
			}
		}
	}
}
