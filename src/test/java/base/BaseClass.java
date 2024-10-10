package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass 
{
	WebDriver driver;
	@Parameters("Browser")
	@BeforeClass
	public void openBrowser(String browser) 
	{
		if(browser=="Chrome") 
		{
			driver=new ChromeDriver();
		}
		
		else if(browser=="Firefox") 
		{
			driver=new FirefoxDriver();
		}
		
		else if(browser=="Edge") 
		{
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
