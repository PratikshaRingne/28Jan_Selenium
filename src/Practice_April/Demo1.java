package Practice_April;

 

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.facebook.com/");
		
		Dimension d=new Dimension(200, 200);
		
		driver.manage().window().setSize(d);
		
		Point p=new Point(500, 400);
		
		driver.manage().window().setPosition(p);
		 

		
		
		
	}
  
}
