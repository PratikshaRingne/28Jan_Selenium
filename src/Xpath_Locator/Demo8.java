package Xpath_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@aria-label,'Email address')]")).sendKeys("abcd");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("xyzcv");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@value='1']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[contains(@autocomplete,'user')]")).sendKeys("as@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("xyzcv");
		
		
	}

}
