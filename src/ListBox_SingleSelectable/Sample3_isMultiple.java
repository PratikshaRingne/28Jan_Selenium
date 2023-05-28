package ListBox_SingleSelectable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample3_isMultiple 
{
	public static void main(String[] args) throws InterruptedException  
	{
WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//select[@id='month']"));
		
		Thread.sleep(2000);
		
		Select s=new Select(ele);
		
		//s.selectByValue("8");
		//s.selectByVisibleText("Apr");
		
		s.selectByIndex(7);
		
		boolean result = s.isMultiple();
		
		if(result)
		{
			System.out.println("Multiple Selectable");
		}
		else
		{
			System.out.println("Single Selectable");
		}
//		 
	}
	
	
	
}	