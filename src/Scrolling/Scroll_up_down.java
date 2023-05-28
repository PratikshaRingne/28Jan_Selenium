package Scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_up_down 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		//scroll down ----> 1 parameter=0, 2parameter=+ve (Pixel values)
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
		
		Thread.sleep(2000);
		
		//Scroll up ---->1 parameter=0, 2parameter=-ve (Pixel values)

		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-450)");
		
	}

}
