package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5_getTitle 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		String URL=driver.getCurrentUrl();
		
		System.out.println(URL);
		
		
		
	}

}
