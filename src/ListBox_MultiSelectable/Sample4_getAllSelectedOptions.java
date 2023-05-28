package ListBox_MultiSelectable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample4_getAllSelectedOptions
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///C:/Users/Pratiksha/Desktop/Selenium%20HTML/Multiple_selectable.html");
		
		WebElement country = driver.findElement(By.xpath("//select[@multiple='true']"));
		
		Select s1= new Select(country);
		
		s1.selectByIndex(3);
		
		s1.selectByIndex(2);
		
		s1.selectByIndex(0);
		
		Thread.sleep(2000);
		
		WebElement first = s1.getFirstSelectedOption();
		
		String op = first.getText();
		System.out.println(op);
		
		List<WebElement> ss = s1.getAllSelectedOptions();
		 
	 
		for(WebElement list :ss)
		{
			System.out.println(list.getText());
		}
		
	}

}
