package dealsdray;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BrowserLaunching {
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void paralleletesting1(String name_of_browser) throws IOException
	{
		if(name_of_browser.equals("chrome"))
		{
			driver=new ChromeDriver();
			/*TakesScreenshot s  =(TakesScreenshot) driver; 
		     File source= s.getScreenshotAs(OutputType.FILE); 
			File destination=new File("C:\\TestNG1\\ChromeScreenshot\\Chromescreenshot1.png");
			FileUtils.copyFile(source, destination);
			
			//find the resolution
			driver.manage().window().setSize(new Dimension(1920,1080));*/
		}
		if(name_of_browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			/*TakesScreenshot s  =(TakesScreenshot) driver; 
		     File source= s.getScreenshotAs(OutputType.FILE); 
			File destination=new File("C:\\TestNG1\\FirefoxScreenshot\\Firefoxscreenshot2");
			FileUtils.copyFile(source, destination);
			//find the resolution
			driver.manage().window().setSize(new Dimension(1366,768));*/
		}
		
		if(name_of_browser.equals("safari"))
		{
			driver=new SafariDriver();
			/*TakesScreenshot s  =(TakesScreenshot) driver; 
		     File source= s.getScreenshotAs(OutputType.FILE); 
			File destination=new File("C:\\TestNG1\\SafariScreenshot\\Safariscreenshot3");
			FileUtils.copyFile(source, destination);
			//find the resolution
			driver.manage().window().setSize(new Dimension(1536,864));*/
		}
	}
		@AfterMethod
		public void LaunchQuit()
		{
		driver.navigate().to("https://www.getcalley.com/page-sitemap.xml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
}
