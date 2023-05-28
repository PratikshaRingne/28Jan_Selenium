package HandlingOfAutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("headphone");
		
		Thread.sleep(2000);
		
	 List<WebElement> options = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));
	 
	 String exptext="headphone case";
	 
	 for(WebElement op:options)
	 {
		 String acttext = op.getText();
		 
		 if(acttext.equals(exptext))
		 {
			 op.click();
		 }
		 
	 }
		
	}

}
