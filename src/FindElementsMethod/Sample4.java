package FindElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.amazon.in/");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath(" //input[@name='field-keywords']")).sendKeys(" Oppo Mobiles 128 gb ram");
		 
		 driver.findElement(By.xpath(" (//input[@type='submit'])[1]")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[9]"));
		 
		 
		
		
		
	}

}
