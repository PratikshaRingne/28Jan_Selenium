package Practice_April;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 
{
	public static void main(String[] args)
	{
		//Methods of webdriver
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	//	driver.close();
	//	driver.quit();
	//  driver.getCurrentUrl();--> return type=string
	//  driver.getTitle();---->return type=string
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		Options o=driver.manage();
		Window w=o.window();
		w.maximize();
		w.minimize();
	//  w.setPosition();
	//	w.setSize(targetSize);
		
		
	}

}
