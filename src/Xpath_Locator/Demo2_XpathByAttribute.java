package Xpath_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2_XpathByAttribute 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//FOR USERNAME
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("prachiringne");
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
