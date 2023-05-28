package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected_8 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(2000);
		
		
		boolean result= driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).isSelected();
		
		System.out.println(result);
	}

}
