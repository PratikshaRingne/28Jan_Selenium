package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example8_Minimize 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		
		
		String Title=driver.getTitle();
		System.out.println(Title);
		
	}

}
