package ListBox_SingleSelectable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample6_getSelectedOption
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Thread.sleep(2000);
		
		Select s1= new Select(month);
		
		String firstOp = s1.getFirstSelectedOption().getText();
		
		System.out.println(firstOp);
		
		 
		
		
				
		
	}

}
