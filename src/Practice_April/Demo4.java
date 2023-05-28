package Practice_April;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(2000);
		
	  boolean result = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).isSelected();
	 
	  
	  System.out.println(result);
	  
	  if(result==true)
	  {
		  System.out.println("Selected");
	  }
	  else
	  {
		  System.out.println("Not Selected");
	  }
		
	}

}
