package POP_UP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2_Alert_Confirmation 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("15246");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(3000);
		
		//first pop up
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		//second pop up
		
		driver.switchTo().alert().accept();
		
	}

}
