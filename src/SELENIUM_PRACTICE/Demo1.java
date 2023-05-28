package SELENIUM_PRACTICE;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo1 
{
	public static void main(String[] args) throws IOException 
	{
		// Screenshot
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		File srce = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\Pratiksha\\Desktop\\Selenium\\Screenshots\\insta.jpg");
		
		FileHandler.copy(srce, dest);

		
		
		
	}

}
