package Practice_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser
		driver.manage().window().maximize();

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='DEL']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

		driver.findElement(By.xpath("//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']")).click();

//	@	if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
//
//		{
//
//		System.out.println("its disabled");
//
//		Assert.assertTrue(true);
//
//		}
//
//		else
//
//		{
//
//		Assert.assertTrue(false);
//
//		}
//
//		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
//
//		driver.findElement(By.id("divpaxinfo")).click();
//
//		   Thread.sleep(2000L);

		for(int i=1;i<5;i++)

		{

		driver.findElement(By.id("hrefIncAdt")).click();

		}

//		@driver.findElement(By.id("btnclosepaxoption")).click();

//		@Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

//		 @System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		// driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

//		@ driver.findElement(By.cssSelector("input[value='Search']")).click();

		// driver.findElement(By.xpath("//input[@value='Search']")).click();

		// driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();

		}
}
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.manage().window().maximize();
//		driver.findElement(By.cssSelector("input#autosuggest")).sendKeys("ind");//typing ind
//		Thread.sleep(2000);
//		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));//list of elements
//		for(WebElement option:options)
//		{
//			if(option.getText().equalsIgnoreCase("india"))//loading every option
//			{
//				option.click(); //if matches it clicks
//				break;
//			}
//		}
//		
//		driver.findElement(By.cssSelector("input#ctl00_mainContent_rbtnl_Trip_1")).click(); //clicking the radio-roundtrip
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); //Click on from search bar
//		driver.findElement(By.xpath("//a[@value='HYD']")).click(); //selecting Hyd 
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='TRV']")).click(); //selecting dest
//		Thread.sleep(2000);
//	    //driver.findElement(By.className("custom_date_pic required home-date-pick valid")).click();	
	
