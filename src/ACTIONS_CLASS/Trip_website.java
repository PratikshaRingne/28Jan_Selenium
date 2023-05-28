package ACTIONS_CLASS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trip_website 
{
	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.makemytrip.com/");
		 
		 driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		 
		 Thread.sleep(2000);
		 
		 List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		  
		 for(WebElement op:options)
		 {
			  System.out.println(op.getText()+"\n ");
			 
		 }
		
	}

}
