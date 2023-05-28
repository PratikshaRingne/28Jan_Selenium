package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6_getCurrenturl
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		
		
	}

}
