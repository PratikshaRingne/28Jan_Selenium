package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Pratiksha/Desktop/Selenium%20HTML/Table.html");
		
		driver.findElement(By.xpath("//table[@id='1234']"));
		
		//Rows
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='1234']//tr"));
		
		System.out.println(rows.size());
		
		
		//Column of a row
		
		List<WebElement> column = driver.findElements(By.xpath(" //table[@id='1234']//tr/th"));
		
		System.out.println(column.size());
		
	}

}
