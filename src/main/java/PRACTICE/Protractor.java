package PRACTICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Protractor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@minlength='2']")).sendKeys("Shashi kumar");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shashithumula111@gmail.com");
		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("shashi123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		WebElement Staticdropdown = driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		Select dropdown=new Select(Staticdropdown);
		dropdown.selectByIndex(1);
		dropdown.selectByIndex(0);
		driver.findElement(By.xpath("//input[@value='option2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("02/22/2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
	}
	}