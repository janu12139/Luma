package day2_10052024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ValidationDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement createAccButton=driver.findElement(By.linkText("Create new account"));
		if(createAccButton.isDisplayed()) {
			createAccButton.click();
			System.out.println("create account button is Enabled");
		}
		else {
			System.out.println("create account button is not displayed");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Janu");
		driver.findElement(By.name("lastname")).sendKeys("naidu");
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
        
        WebElement wb=driver.findElement(By.name("sex"));
        if(!(wb.isSelected())) {
        	wb.click();
        	System.out.println("successfully gender is selected");
        }
        else {
        	System.out.println("No i ant selectd but its alrdy selectd");
        }
        WebElement sugnup=driver.findElement(By.name("websubmit"));
        if(sugnup.isEnabled()) {
        	sugnup.click();
        	System.out.println("yes signup button is verified");
        }
        else {
        	System.out.println("ignup button is not displayed");
        }



        driver.findElement(By.name("websubmit")).click();
		Thread.sleep(2000);
        driver.close();
     	}



	}

}
