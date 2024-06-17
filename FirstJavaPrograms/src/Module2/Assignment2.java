package Module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(1000);
		//Enter Customer ID
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("jahnavi");
		//Click on submit Button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(2000);
		//Prompt will openand accept 
		driver.switchTo().alert().accept();
		System.out.println(driver.switchTo().alert().getText());
       Thread.sleep(1000);
		driver.switchTo().alert().accept();
		//System.out.println(driver.switchTo().alert().getText());
        driver.quit();

	   


	}

}
