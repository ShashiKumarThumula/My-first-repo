//package Practice_programs;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import static Keka_project.KekaProject_TestNg.with;
//
//public class Relative_Below {
//
//	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();
//
//		driver.manage().window().maximize();
//
//		driver.get("https://rahulshettyacademy.com/angularpractice/");
//
//		WebElement dOB=driver.findElement(By.cssSelector("[for='dateofBirth']"));
//
//		driver.findElement(with(By.tagName("input")).below(dOB)).click();  //using below
//
//		WebElement icecream=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
//
//
//		driver.findElement(with(By.tagName("input")).toLeftOf(icecream)).click();
//
//		//Using relative locator left
//
//	}
//
//}
