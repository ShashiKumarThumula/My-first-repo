package Practice_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.rahulshettyacademy.com/");
		driver.navigate().back();
		driver.navigate().forward();

	}

}
