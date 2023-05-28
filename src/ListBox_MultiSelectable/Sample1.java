package ListBox_MultiSelectable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample1 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Pratiksha/Desktop/Selenium%20HTML/Multiple_selectable.html");
		
		WebElement country = driver.findElement(By.xpath("//select[@multiple='true']"));
		
		Select s=new Select(country);
		
		s.selectByIndex(2);
		
		s.selectByIndex(1);
		
		s.selectByIndex(3);
		
		Thread.sleep(2000);
		
		s.deselectAll();
		
		boolean result = s.isMultiple();
		
		if(result)
		{
			System.out.println("List Box is Multi selectable");
		}
		else
		{
			System.out.println("List Box is single selectable");
		}
		
		
		
	}

}
