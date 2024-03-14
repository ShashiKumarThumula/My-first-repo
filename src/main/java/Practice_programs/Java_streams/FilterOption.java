package Practice_programs.Java_streams;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterOption {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("search-field")).sendKeys("Rice");   //enter rice in search bar
		
		List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));  // store the veggies in variable
		
		//5 results  , 1 result
		
		List<WebElement> filteredList=veggies.stream().filter(veggie->veggie.getText().contains("Rice")).collect(Collectors.toList());
		
		//1 result	
		
		Assert.assertEquals(veggies.size(),filteredList.size());  //comparing original and filtered list
		
		
	}

}
