package Practice_programs;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VegToCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//expected array
		String [] itemsNeeded= {"Cucumber", "Brocolli", "Beetroot", "Carrot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//Thread.sleep(2000);
		addItems(driver, itemsNeeded);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		//explicit wait
 
 
		//  WebDriverWait w =new WebDriverWait(driver,5);
		//  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
 
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
 
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
        WebElement element =driver.findElement(By.xpath("//select[@style='width: 200px;']"));
		Select option = new Select(element);
		option.selectByVisibleText("Canada");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		
	}
 
	public static void addItems(WebDriver driver, String [] itemsNeeded)
	{
 
		int j=0;
 
		List<WebElement> products= driver.findElements(By.xpath("//h4[@class='product-name']"));
 
		for(int i=0;i<products.size();i++)
		{
			//Brocolli - 1kg
			//Brocolli, 1 kg
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
 
 
			//format it to get actual vegetable name
			//check whether name u extracted is presented in arrayList or not-
			// convert array into arrayList for easy search
 
			List itemsNeededList =Arrays.asList(itemsNeeded);
 
			if(itemsNeededList.contains(formattedName))
			{
				j++;
				//click on Add to Cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsNeeded.length)
				{
					break;
				}
			}
		}
	}
}
 