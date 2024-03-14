package Practice_programs.Java_streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortedOrNot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//tr//th[1]")).click();//1. Capture the column
		
		List<WebElement> elementsList=driver.findElements(By.xpath("//tr//td[1]"));//2. capture all elements into list
		
		List<String>OriginalList=elementsList.stream().map(s->s.getText()).collect(Collectors.toList());//3.Capture text of webelements into new(original) list
																					//Collected list is stored in list
		
		List<String>SortedList=  OriginalList.stream().sorted().collect(Collectors.toList());   //4.Sort on the original list
		
		
		Assert.assertTrue(OriginalList.equals(SortedList));		//5.Compare original vs sorted list
		
		}
}
