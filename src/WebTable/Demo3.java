package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yatra.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("( //input[@name='flight_origin_date'])[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//table[contains(@class,'days-head day-container')]"));
		
		Thread.sleep(2000);
		
		WebElement date = driver.findElement(By.xpath("( //table[contains(@class,'days-head day-container')])[7]//tr[3]/td[4]"));
		 
		date.click();
		
		
		
	 
	}

}
