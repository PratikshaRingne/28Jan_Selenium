package ListBox_MultiSelectable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample2_isMultiple 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Pratiksha/Desktop/Selenium%20HTML/Multiple_selectable.html");
		
		WebElement counrty = driver.findElement(By.xpath("//select[@multiple='true']"));
		
		Select s=new Select(counrty);
		
		boolean result = s.isMultiple();
		
		System.out.println(result);
		
		if(result)
		{
			System.out.println("Multi Selectable List BOx");
		}
		else
		{
			System.out.println("Single Selectable List BOx");
		}
		
	}

}
