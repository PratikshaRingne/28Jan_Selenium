package ACTIONS_CLASS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample4_doubleClick 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		
		Thread.sleep(2000);
		
		WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(doubleclick).perform();
		
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		
		alt.dismiss();
		
		
	}
		
		
		
	

}
