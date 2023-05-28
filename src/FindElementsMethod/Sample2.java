package FindElementsMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> input = driver.findElements(By.xpath("//input"));
		
		  System.out.println(input.size());
		
		for(WebElement in:input)
		{
			
			System.out.println(in.getText());
			
		}
		
	}

}
