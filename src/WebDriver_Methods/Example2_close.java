package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Example2_close
{
	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.close();   // close the respective opened tab
		
		driver.quit();     //Quit exit from browser
		
		
		
	}

}
