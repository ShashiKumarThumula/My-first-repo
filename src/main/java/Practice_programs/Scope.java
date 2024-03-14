package Practice_programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.findElements(By.tagName("a")).size());//count of all tags in page
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));//locating the footer elements
		
		System.out.println(footerDriver.findElements(By.tagName("a")).size());//count of footer tags
		
		WebElement columnDriver=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(columnDriver.findElements(By.tagName("a")).size());//count of column tags
		
		for(int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++)//checking if the links are working
		{
			String clickOnLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(5000);
		}
			
			Set<String> abc=driver.getWindowHandles();
			
			Iterator<String>it=abc.iterator();
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		}
	}
