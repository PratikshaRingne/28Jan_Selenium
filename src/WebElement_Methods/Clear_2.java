package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
		 driver.manage().window().maximize();
		 
		WebElement ele = driver.findElement( By.xpath("//input[@type='text']"));
		
		Thread.sleep(2000);
		
		ele.sendKeys("fgdgjkjnxdm");
		
		Thread.sleep(2000);
		
		//clear the entered value
		
		ele.clear();
		
		
	
	}

}
