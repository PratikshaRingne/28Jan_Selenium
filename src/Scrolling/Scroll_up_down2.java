package Scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_up_down2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		//scroll down
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(2000);
		
		//Scroll up
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-1000)");
	}

}
