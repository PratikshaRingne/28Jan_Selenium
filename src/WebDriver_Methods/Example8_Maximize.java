package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class Example8_Maximize 
{
	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
		 Thread.sleep(2000);
		 
		 Options S1=driver.manage();
		 Window S2 = S1.window();
		 S2.maximize();
		 
	   //driver.manage().window().maximize();
		 
		 Thread.sleep(2000);
		 
		 driver.quit();
		 
		 
		 
		 
		 
		 
		
	}

}
