package ACTIONS_CLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample6 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement more = driver.findElement(By.xpath("//div[text()='More']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(more).perform();
		
		WebElement notification = driver.findElement(By.xpath("//div[@class='_3vhnxf']"));
		
		act.click(notification).perform();
		
	}

}
