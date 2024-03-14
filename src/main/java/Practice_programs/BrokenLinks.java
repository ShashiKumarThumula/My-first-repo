package Practice_programs;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//broken URL
		//Step1: Is to get all urls tied up to the links using selenium
		//Java methods will call URL's and gets you the status code
		//if status code >400 then that url is not working -> link which tied to url is broken

		driver.get("https://rahulshettyacademy.com/AutomationPractice");

		List<WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		SoftAssert sa = new SoftAssert();

		for (WebElement link : links) {

			String url = link.getAttribute("href");

			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection(); //opening the connection

			conn.setRequestMethod("HEAD"); //setting the method
			conn.connect(); //establishing the connection
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			sa.assertTrue(respCode <400, "The link with text" + link.getText() + "is broken with code" + respCode);
		}
		sa.assertAll();
	}
}