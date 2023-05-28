package Scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.mintra.com/");
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-1000)");
	}

}
