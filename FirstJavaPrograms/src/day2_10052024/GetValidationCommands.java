package day2_10052024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetValidationCommands {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String actualTitle=driver.getTitle();
		String expTitle="Facebook – log in or sign up";
				if(actualTitle.equals(expTitle)) {
					System.out.println("if title is correct testcase is passed");
				}
				else {
					System.out.println("if title is not pass testcase is fails");
				}
				
				System.out.println("My curent page URL: "+driver.getCurrentUrl());

               WebElement creatAct=driver.findElement(By.linkText("Create new account"));
               System.out.println(creatAct.getAttribute("class"));
               creatAct.click();
               Thread.sleep(2000);
              List<WebElement> gender= driver.findElements(By.name("sex"));
              System.out.println(gender.size());
              for(int i=0;i<gender.size();i++) {
            	  String value=gender.get(i).getAttribute("value");
            	  String tagname=gender.get(i).getTagName();
            	  System.out.println(tagname);
            	  System.out.println(gender.get(i).getSize());
            	  		
            	  

            	  if(value.equals("2")) {
            		  gender.get(i).click();
            	  }
              }
              
              
             WebElement reb= driver.findElement(By.name("websubmit"));
             System.out.println(reb.getText());
	}
	

}
