package ListBox_SingleSelectable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample5_getSelectedOption 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
		//day
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s1=new Select(day);
		
		WebElement firstOption = s1.getFirstSelectedOption();
		
		System.out.println(firstOption.getText());
		
		//month
		
       WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s2=new Select(month);
		
		WebElement firstOption2= s2.getFirstSelectedOption();
		
		System.out.println(firstOption2.getText());
		
		//year
		
		 WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
			
			Select s3=new Select(year);
			
			WebElement firstOption3= s3.getFirstSelectedOption();
			
			System.out.println(firstOption3.getText());
			
		 
		
		
		
	}

}
