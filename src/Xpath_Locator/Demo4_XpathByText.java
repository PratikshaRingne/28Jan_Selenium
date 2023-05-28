package Xpath_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4_XpathByText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 //Email Address By Attribute 
		 
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pratiksharingne");
		 Thread.sleep(2000);
		 
		 //Password By Attribute 
		 
		 driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("7744838574");
		 Thread.sleep(2000);
		 
		 //Log in by text
		 
		 driver.findElement(By.xpath("//button[text()='Log in']")).click();
		 Thread.sleep(2000);
		 
		 driver.quit();
	}

}
