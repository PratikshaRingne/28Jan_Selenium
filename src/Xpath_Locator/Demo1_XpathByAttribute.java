package Xpath_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1_XpathByAttribute  
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//driver.findElement("Locator type");
//---IMP---//driver.findElement(By.xpath("xpath expression")).sendKeys("---");
		
		//--syntax for finding expression by 'attribute'---
		//----->  //tagname[@attribute name='attribute value']
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Pratiksha");
		
		
		
		
		 
		
	}

	 
	

}
