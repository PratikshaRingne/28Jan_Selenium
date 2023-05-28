package ListBox_SingleSelectable;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AscendingOrderData 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Thread.sleep(2000);
		
		Select s1=new Select(month);
		
		List<WebElement> op = s1.getOptions();
		Thread.sleep(2000);
	 
//		for(WebElement L:op)
//		{
//			 System.out.println(L.getText());
//		}
//		 
		 TreeSet<String> tr=new TreeSet<String>();
		 for(WebElement t:op)
		 {
			 String st=t.getText();
			 tr.add(st);
		 }
		 System.out.println("______________");
		 for(String list:tr)
		 {
			 System.out.println(list.valueOf(list) );
		 }
		 
		
		
	}

}
