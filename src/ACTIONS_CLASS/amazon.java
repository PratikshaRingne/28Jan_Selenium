package ACTIONS_CLASS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("headphone");
		
		Thread.sleep(3000);
		
		List<WebElement> options = driver.findElements(By.xpath(" //div[@class='nav-issFlyout nav-flyout']//div"));
		
		String expt="headphone stand";
		
		for(WebElement op:options) 
		{
			
			System.out.println(op.getText());  //35
			//String act = op.getText();
			
//			if(act.equals(expt))
//			{
//				 op.click();
//				 break;
//			}
//			 
			
		}
		
	}

}
