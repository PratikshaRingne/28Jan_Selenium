package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 
{
	public static void main(String[] args) throws InterruptedException 
	{
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.mintra.com/");
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='View all']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",ele);
		
		Thread.sleep(2000);
		
		//support button
		
		WebElement ele2 = driver.findElement(By.xpath(" //a[text()='Support']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",ele2);
	}

}
