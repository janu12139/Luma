package day2_10052024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchLinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		Thread.sleep(2000);
		List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        for(int i=0;i<links.size();i++) {
        	String linkname=links.get(i).getText();
        	String url=links.get(i).getAttribute("href");

        	System.out.println((i+1)+". "+linkname+"----->"+url);
        }

	}

}
