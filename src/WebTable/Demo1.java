package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Pratiksha/Desktop/Selenium%20HTML/Table.html");
		
		driver.findElement(By.xpath("//table[@id='1234']"));
		
		WebElement sr = driver.findElement(By.xpath("//table[@id='1234']//tr[1]/th[1]"));
		
		System.out.println(sr.getText());
		
		
		
	}

}
