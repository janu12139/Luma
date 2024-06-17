package day1_09052024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Jaanu");
		driver.findElement(By.name("lastname")).sendKeys("v");
		driver.findElement(By.name("reg_email__")).sendKeys("9177570288");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Admin@1234");
		
		WebElement day=driver.findElement(By.id("day"));
        Select s=new Select(day);
        s.selectByIndex(19);
        
		WebElement month=driver.findElement(By.id("month"));
        Select s1=new Select(month);
        s1.selectByValue("11");

		WebElement y=driver.findElement(By.id("year"));
        Select year=new Select(y);
        year.selectByVisibleText("1991");
		Thread.sleep(2000);

        
        driver.findElement(By.className("_8esa")).click();
		Thread.sleep(2000);

		WebElement g=driver.findElement(By.name("preferred_pronoun"));
        Select gd=new Select(day);
        gd.selectByIndex(1);

        driver.findElement(By.name("websubmit")).click();
		Thread.sleep(2000);
        driver.close();
     	}

}
