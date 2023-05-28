package POP_UP;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3_ChildBrowserORWindow 
{
	public static void main(String[] args) throws InterruptedException 
	{ 
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://skpatro.github.io/demo/links/");
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.findElement(By.xpath(" //input[@name='NewTab']")).click();
		 
		 
		 Set<String> ids = driver.getWindowHandles();
		 
		 ArrayList<String> al= new ArrayList<String>(ids);
		 
		 driver.switchTo().window(al.get(1));
		 
		 
		 driver.findElement(By.xpath("( //span[text()='Training'])[1]")).click();
		 
		 driver.switchTo().window(al.get(0));
		 
		 driver.findElement(By.xpath(" //input[@name='NewWindow']")).click();
        
		 Set<String> ids1 = driver.getWindowHandles();
		 
		 ArrayList<String> all= new ArrayList<String>(ids1);
		 
		 
		 driver.switchTo().window(all.get(2));
		 
		 driver.manage().window().maximize();
		  
		 driver.findElement(By.xpath("( //i[@class='fa-fw fab fa-youtube'])[1]")).click();
		 
		 
		 
		
	}

}
