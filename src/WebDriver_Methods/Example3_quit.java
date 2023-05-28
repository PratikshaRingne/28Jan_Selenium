package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_quit
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		
		Thread.sleep(3000);  //to stop for a while
		
		
		driver.quit();
		
		
	}

}
