package Practice_April;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flowlu.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		 
	}

}
