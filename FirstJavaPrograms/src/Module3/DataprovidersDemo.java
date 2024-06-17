package Module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataprovidersDemo {

	static WebDriver driver;


		@BeforeClass

	  	public void before() {

	  		driver = new ChromeDriver();

	  		driver.get("https://demo.guru99.com/test/login.html");

	  		driver.manage().window().maximize();

	  	}

	    @Test(dataProvider="dataprovider")

	    public void f(String Email, String Password) {

	  		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Email);
	  		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(Password);
	  	  	driver.findElement(By.xpath("//button/child::span")).click();


	  		}
	    @DataProvider(name="dataprovider")
	    public Object[][] logindata() {
	  	  Object[][] data= new Object[][]{
	  		  {"donhere@gmail.com","don@123"},
	  		 
	  	  };

	  	   return data;//we are returning data to the test methods.
	    }



	 @AfterClass
	 public void afterClass() {
		driver.quit();
	}
	  
}
	  

	  



	


