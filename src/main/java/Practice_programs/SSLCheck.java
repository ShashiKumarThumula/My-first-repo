package Practice_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();

		options.setAcceptInsecureCerts(true);//bypassing the insecurity

		//Firefox options =new Firefox options

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://expired.badssl.com/");

		System.out.println(driver.getTitle());

	}
}
