package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Send_Keys_1 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//enter value in email
		
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		ele.sendKeys("absdg");
		
		
		
	
	}
	

}
