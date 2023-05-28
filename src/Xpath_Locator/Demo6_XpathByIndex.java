package Xpath_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6_XpathByIndex 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
//	imp--->	//driver.findElement(By.xpath("//tagname[contains(@attribute_name,partial attribute value')]"))
		
		
		// Create new account
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
		
		// first name
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("prachi");
		Thread.sleep(2000);
		// surname
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("rathod");
		
		Thread.sleep(2000);
	}

}
