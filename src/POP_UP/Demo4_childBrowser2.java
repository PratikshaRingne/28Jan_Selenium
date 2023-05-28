package POP_UP;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo4_childBrowser2 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://skpatro.github.io/demo/links/");
		 
		 driver.manage().window().maximize();
		 
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.findElement(By.xpath(" //input[@name='NewTab']")).click();
		 
		 Set<String> ids = driver.getWindowHandles();
		 
		 ArrayList<String> al= new ArrayList<String>(ids);
		 
		 driver.switchTo().window(al.get(1));
		 
		 WebElement list = driver.findElement(By.xpath(" //span[text()='Selenium']"));
		 
		 Actions s1=new Actions(driver);
		 
		 s1.click(list).perform();
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
