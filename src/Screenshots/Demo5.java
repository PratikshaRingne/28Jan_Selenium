package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo5 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		File main = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 File dest=new File("C:\\Users\\Pratiksha\\Desktop\\Selenium\\Screenshots\\face.jpg");
		 
		 FileHandler.copy(main, dest);

		
	}

}
