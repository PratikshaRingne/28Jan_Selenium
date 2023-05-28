package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.meesho.com/");
		
		WebElement frame_style = driver.findElement(By.xpath("//span[text()='frame_style']"));
		
		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",frame_style);
		
		
		
	}

}
