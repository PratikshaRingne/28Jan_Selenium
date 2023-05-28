package ListBox_MultiSelectable;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample3_getOPtions 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Pratiksha/Desktop/Selenium%20HTML/Multiple_selectable.html");
		
		WebElement country = driver.findElement(By.xpath("//select[@multiple='true']"));
		
		 Select s=new Select(country);
		 
		 List<WebElement> op = s.getOptions();
		 
		 
		 for(WebElement list:op)
		 {
			 System.out.println(list.getText());
		 }
		 
		 
		 
		 
		 
		
	}

}

