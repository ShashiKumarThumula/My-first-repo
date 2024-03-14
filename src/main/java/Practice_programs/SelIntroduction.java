package Practice_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\Selenium\\chromedriver-win64/chromedriver.exe");
		 */		
		System.setProperty("webdriver.Edge.driver","D:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getCurrentUrl());
		/*
		 * driver.get("https://www.youtube.com/"); driver.get("https://www.gmail.com/");
		 * driver.get("https://www.googledrive.com/");
		 */
		driver.close();
	}
}
