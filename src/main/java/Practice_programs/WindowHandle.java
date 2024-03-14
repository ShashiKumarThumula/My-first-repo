package Practice_programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");// parent window
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[class='blinkingText']")).click();// child window
		Set<String> windows = driver.getWindowHandles();// getting the id's of windows [parent id, child id]
		Iterator<String> it = windows.iterator();// to collect the id's
		String ParentId = it.next();// parent
		String ChildId = it.next();// child
		driver.switchTo().window(ChildId);
		System.out.println(driver.findElement(By.xpath("//a[text()='mentor@rahulshettyacademy.com']")).getText());
		String Email = driver.findElement(By.xpath("//a[text()='mentor@rahulshettyacademy.com']")).getText()
				.split("@")[1];
		System.out.println(Email);
		driver.switchTo().window(ParentId);
		driver.findElement(By.cssSelector("input#username")).sendKeys(Email);

	}
}
