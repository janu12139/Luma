package Module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(1000);
		//Retrieve the all company names and print the console
		String table=driver.findElement(By.xpath("//table[@class='dataTable']")).getText();
	    System.out.println(table);
		


	}

}
