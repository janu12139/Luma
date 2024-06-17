package day4_14052024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(2000);
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
       driver.findElement(By.xpath("//input[@id='a']")).click();
		driver.switchTo().parentFrame();
       //driver.switchTo().frame(1);
      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jahnavi");
		driver.switchTo().defaultContent();
        
		WebElement e=driver.findElement(By.xpath("//select[@id='animals']"));
		Select sc=new Select(e);
		sc.selectByValue("Avatar");
		
		


	}

}
