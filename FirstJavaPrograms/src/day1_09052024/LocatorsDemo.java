package day1_09052024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("input")).click();
		Thread.sleep(1000);
      driver.findElement(By.id("input")).sendKeys("Selenium");
		Thread.sleep(1000);
		driver.findElement(By.id("input")).clear();

	}

}
