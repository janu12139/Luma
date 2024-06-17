package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingIndex {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html#google_vignette");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//table[@id='contactList']//tbody/tr[6]"));
		driver.findElement(By.xpath("(//table[@id='contactList']//tbody/tr/td)[23]"));
		driver.close();


	}

}
