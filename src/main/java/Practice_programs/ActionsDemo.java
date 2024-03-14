package Practice_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions A =new Actions(driver);
		WebElement move=driver.findElement(By.cssSelector("[class='-dOa_b L_FVxe']"));
		A.moveToElement(driver.findElement(By.cssSelector("[class='Pke_EE']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();//Entering HELLO in textbox in caps and db click
		A.moveToElement(move).contextClick().perform();//mouse hover on login 
	}

}
