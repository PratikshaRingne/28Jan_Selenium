package Xpath_Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new  ChromeDriver();
		 
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.quit();
		
		
		
		
	}	

}
