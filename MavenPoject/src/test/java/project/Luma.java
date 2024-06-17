package project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Luma {
	static WebDriver driver;
	@Test

	public void f1() throws InterruptedException, IOException {
		driver = new ChromeDriver();

		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//li[@class='authorization-link']/child::a)[1]")).click();
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\Desktop\\Book2.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		for(int i=1;i<=sheet.getLastRowNum();i++) {
			String Email=sheet.getRow(i).getCell(0).getStringCellValue();
			String PW=sheet.getRow(i).getCell(1).getStringCellValue();

			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Email);
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(PW);
			driver.findElement(By.xpath("//span[text()='Sign In']")).click();
			Thread.sleep(1000);
			//womens in tops
			Actions action=new Actions(driver);
			action
			.moveToElement(driver.findElement(By.xpath("//span[text()='Women']")))
			.moveToElement(driver.findElement(By.xpath("//span[text()='Tops']")))
			.click().perform();
			driver.findElement(By.className("product-image-photo")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("option-label-size-143-item-167")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("option-label-color-93-item-59")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();

			Actions action1=new Actions(driver);
			action1
			.moveToElement(driver.findElement(By.xpath("//span[text()='Women']")))
			.moveToElement(driver.findElement(By.xpath("//span[text()='Bottoms']")))
			.click().perform();
			driver.findElement(By.xpath("//img[@alt='Artemis Running Short']")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("option-label-size-143-item-171")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='option-label-color-93-item-49']")).click();
			driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
			Actions action2=new Actions(driver);
			action2
			.moveToElement(driver.findElement(By.xpath("//span[text()='Gear']")))
			.moveToElement(driver.findElement(By.xpath("//span[text()='Bags']")))
			.click().perform();
			//Thread.sleep(1000);
			driver.findElement(By.className("product-image-photo")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='qty']")).sendKeys("1");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
			Thread.sleep(1000);
//			WebElement List=driver.findElement(By.xpath("(//strong[text()='My Wish List'])[1]"));
//			if(List.isDisplayed()) {
//				System.out.println(List.getText());
//
//			}
			driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Laptops");
			driver.findElement(By.xpath("//input[@id='search']")).submit();
			String text=driver.findElement(By.xpath("//div[text()='You have no items to compare.']")).getText();
			Assert.assertEquals("You have no items to compare.", text);
			System.out.println("Search results as:" +text);
			driver.findElement(By.id("search")).clear();
			driver.findElement(By.id("search")).sendKeys("Yoga Shirts");
			driver.findElement(By.id("search")).submit();
			Thread.sleep(1000);
			Actions action3=new Actions(driver);
            action3
			.moveToElement(driver.findElement(By.xpath("//span[text()='Gear']")))
			.moveToElement(driver.findElement(By.xpath("//span[text()='Bags']")))
			.click().perform();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//a[@class='action showcart']")).click();
            driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@name='ko_unique_1']")).click();
            driver.findElement(By.xpath("//span[text()='Next']")).click();
            driver.findElement(By.xpath("//span[text()='Place Order']")).click();
            driver.findElement(By.xpath("//span[text()='Continue Shopping']")).click();




	}
	}
}

