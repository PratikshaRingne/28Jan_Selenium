package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled_5 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement result = driver.findElement(By.xpath("//button[text()='Log in']"));
		boolean a=result.isEnabled();
		
		// System.out.println(result.isEnabled());
		 
		 if(a)
		 {
			System.out.println("Enabled"); 
		 }
		 else
		 {
			 System.out.println("disabled");
		 }
		
	}

}
