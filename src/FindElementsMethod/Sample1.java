package FindElementsMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 
{
	public static void main(String[] args) 
	{
		//Print all links text present On facebook main page
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		System.out.println(links.size()+"\n_________");
		
		for(WebElement li :links)
		{
			System.out.println(li.getText());
			
		}
		
	}

}
