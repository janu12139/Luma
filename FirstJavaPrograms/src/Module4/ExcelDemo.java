package Module4;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelDemo {
	static WebDriver driver;



	public static void main(String[] args) throws InterruptedException, IOException {

	  	   driver = new ChromeDriver();

	  		driver.get("https://demo.guru99.com/V4");

	  		driver.manage().window().maximize();
			FileInputStream fis=new FileInputStream("C:\\Users\\jahnavi.v\\Desktop\\Book1.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=b.getSheet("Sheet3");
			for(int i=1;i<=sheet.getLastRowNum();i++) {
			String un=sheet.getRow(i).getCell(0).getStringCellValue();
			String pw=sheet.getRow(i).getCell(1).getStringCellValue();
				
				driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(un);
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pw);
				driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
				Thread.sleep(1000);
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
				driver.close();


			}
	}
		

	}





	


