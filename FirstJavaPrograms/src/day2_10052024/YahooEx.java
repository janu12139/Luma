package day2_10052024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooEx {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://yahoomail.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("signin-main")).click();
		
		WebElement un=driver.findElement(By.id("login-username"));
		un.sendKeys("jahnavi@gmail.com");
	
		
		WebElement next=driver.findElement(By.id("login-signin"));
		next.click();
		
		

	}

}
