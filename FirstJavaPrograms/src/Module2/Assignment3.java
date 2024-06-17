package Module2;


import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://jqueryui.com/");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement draggable=driver.findElement(By.xpath("//aside[@Class='widget']/child::ul/li/a"));
		js.executeScript("arguments[0].click()",draggable);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement draggableElement=driver.findElement(By.id("draggable"));
		String script="arguments[0].style.transform='translate(200px,100px)';";
		js.executeScript(script, draggableElement);
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./screenn/img.jpg" + System.currentTimeMillis() + ".png"));
		Thread.sleep(1000);
		driver.close();
		
		
		

	}

}
