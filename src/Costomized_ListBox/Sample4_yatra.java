package Costomized_ListBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample4_yatra
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.tripodeal.com/flight-deal?utm_source=bing&msclkid=c62e81b7efd410fd5b1ce5da41478c84");
		
		WebElement from = driver.findElement(By.xpath(" //input[@name='origin']"));
		
		Actions act = new Actions(driver);
		
		act.click(from).perform();
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ENTER).perform();
		
		
	}

}
