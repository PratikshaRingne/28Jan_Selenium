package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_get 
{
	public static void main(String[] args) 
	{
		
		//We Can Access The Below code In Any Browser------(WebDriver Interface)
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	}

}
