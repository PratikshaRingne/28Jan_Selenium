package Xpath_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3_XpathByText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//Username----->Bytext-----> (By.xpath("//tagname[text()='text value']"))
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
