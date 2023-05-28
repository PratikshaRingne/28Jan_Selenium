package POP_UP;
 

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//  FEATURES 
//  1.These Popups are colourful 
//  2.We can directly inspect the components on popup
//  3.NO NEED TO SWITCH

public class Demo1_HiddenDivision 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("pratiksha");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		
		
		
	}

}
