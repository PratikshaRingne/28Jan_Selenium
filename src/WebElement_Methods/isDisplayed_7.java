package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed_7 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		boolean result = driver.findElement(By.xpath(" //img[@alt='Facebook']")).isDisplayed();
		
		System.out.println(result);
		
		if(result)
		{
			System.out.println("Displayed");
		}
		else
		{
			System.out.println("Not Displayed");
		}
		
	}

}
