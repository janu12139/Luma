package Module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		Thread.sleep(1000);
		//Get title of Page
		System.out.println(driver.getTitle());
				
		//verify the pageTitle
		String A=driver.getTitle();
		String ET="Radio Button & Check Box Demo";
		if(A.equals(ET)) {
			System.out.println("The title is matching so its verified");
			
			
		}
		else {
			System.out.println("The title is not matching so its not verified");
		}
		//Find theOption1
		WebElement Option1=driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
		Option1.click();
		//Find the Checkbooks 2 and 3
		WebElement CheckBox2=driver.findElement(By.xpath("//input[@id='vfb-6-1']"));
		CheckBox2.click();
		WebElement CheckBox3=driver.findElement(By.xpath("//input[@id='vfb-6-2']"));
		CheckBox3.click();
		Thread.sleep(1000);
		//Get Suggested site
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		//Find the country Dropdown and select it
		WebElement Country=driver.findElement(By.xpath("//select[@name='country']"));
		Thread.sleep(1000);
		Select sc=new Select(Country);
		sc.selectByVisibleText("KUWAIT");
		driver.close();
		
		
}

}
