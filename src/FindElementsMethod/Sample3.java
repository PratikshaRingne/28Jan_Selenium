package FindElementsMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Pratiksha/Desktop/Selenium%20HTML/checkboxes.html");
		
		List<WebElement> boxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(boxes.size());
		
		for(WebElement b:boxes)
		{
			b.click();
			Thread.sleep(1000);
			
			
		}
		
		for(WebElement b:boxes)
		{
			b.click();
			Thread.sleep(1000);
			
		}
		
	}

}
