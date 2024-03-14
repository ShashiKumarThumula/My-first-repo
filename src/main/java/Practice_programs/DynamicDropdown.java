package Practice_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); // locating departure dropdown

		driver.findElement(By.xpath("//a[@value='HYD']")).click(); // Selecting from address from dropdown
		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[@value='VNS'])[2]")).click(); //Selecting to address from dropdown
		driver.findElement(
				By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value='VNS']")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();// Picking current date
		driver.findElement(By.className("custom_date_pic required home-date-pick valid")).click();

	}

}
