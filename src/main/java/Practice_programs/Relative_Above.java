package Practice_programs;//package Practice_programs;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import static Keka_project.KekaProject_TestNg.with;
//
//public class Relative_Above {
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
//		WebElement Editbox=driver.findElement(By.cssSelector("[name='name']"));  //Locating editbox
//
//		String label=driver.findElement(with(By.tagName("label")).above(Editbox)).getText();  //Using relative locator ABOVE
//
//		System.out.println(label);
//	}
//
//}
