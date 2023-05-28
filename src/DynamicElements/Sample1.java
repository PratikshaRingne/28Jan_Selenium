package DynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(" //input[@class='_3704LK']")).sendKeys("oppo mobile");
		
		Thread.sleep(2000);
		 
		driver.findElement(By.xpath(" //button[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		//oppo A17(midnight black,64 gb)
		
		WebElement review = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[8]"));
		
		System.out.println(review.getText());
		
		
	}

}
