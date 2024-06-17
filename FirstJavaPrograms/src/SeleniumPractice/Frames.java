package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("jaanu");
	Thread.sleep(1000);	
	driver.switchTo().frame(1);//frame1
		Select sc=new Select(driver.findElement(By.id("course")));
		sc.selectByIndex(1);
		
        driver.switchTo().frame(2);//fram2
    	Thread.sleep(1000);	

        driver.findElement(By.id("firstName")).sendKeys("janu");
       driver.findElement(By.id("lastName")).sendKeys("naidu");
   	Thread.sleep(1000);	

       driver.switchTo().defaultContent();
		driver.switchTo().frame("frm2");//frame1
		Thread.sleep(1000);	

		sc.selectByVisibleText("Dot Net");
		Thread.sleep(1000);	

		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("jahnavi");


        
		

		
		

	}

}
