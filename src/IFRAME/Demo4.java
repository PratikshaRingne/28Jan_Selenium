package IFRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 
{
	public static void main(String[] args) throws InterruptedException 
	{
       WebDriver driver = new ChromeDriver();
       
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		
		driver.switchTo().frame("iframeResult"); //id
		
		 
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath(" //a[@onclick='openMenu()']")).click();
		
		
		 
		
	}

}
