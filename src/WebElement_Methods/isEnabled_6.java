package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled_6 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Instagram.com/");
		
		Thread.sleep(2000);
		
		boolean result = driver.findElement(By.xpath("//div[text()='Log in']")).isEnabled();
		
		if(result)
		{
			System.out.println("Disabled");
		}
		else
		{
			System.out.println("Enabled");
		}
		
	}

}
