package Screenshots;

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
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(source);
		
		File dest=new File("C:\\Users\\Pratiksha\\Desktop\\Selenium\\Screenshots\\facebook.jpg");
		
	    FileHandler.copy(source, dest);
		
	}

}
