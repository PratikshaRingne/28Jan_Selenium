package HandlingOfAutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		
		Thread.sleep(2000);
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		String exptext="redmi 12c";
		
		for(WebElement op:options)
		{
			String acttext = op.getText();
			
			if(acttext.equals(exptext))
			{
				 op.click();
				 break;
			}
			
		}
		
		
		
	}

}
