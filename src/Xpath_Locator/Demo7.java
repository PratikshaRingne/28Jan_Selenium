package Xpath_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/");
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(" //span[text()='SPOTLIGHT']")).click();
		
		
		
		
	}

}
