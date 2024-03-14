package Practice_programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invoke_MultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
//		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String>handles=driver.getWindowHandles();
		
		Iterator<String> it=handles.iterator();
	
		String ParentWindow=it.next();
		
		String ChildWindow=it.next();
		
		driver.switchTo().window(ChildWindow);
		
		driver.get("https://courses.rahulshettyacademy.com/");
		
	}

}
