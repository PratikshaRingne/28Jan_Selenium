package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.mintra.com/");
		
		WebElement ele = driver.findElement(By.xpath(" //button[text()='Sign Up']"));
		
		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",ele);
		
		
		
	}

}
