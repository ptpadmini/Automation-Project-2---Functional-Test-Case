package dealsdray;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UITesting4 {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void paralleletesting1(String name_of_browser) throws IOException
	{
		if(name_of_browser.equals("chrome"))
		{
			driver=new ChromeDriver();
			TakesScreenshot s  =(TakesScreenshot) driver; 
		     File source= s.getScreenshotAs(OutputType.FILE); 
			File destination=new File("C:\\TestNG1\\ChromeScreenshot\\Chromescreenshot1.png");
			FileUtils.copyFile(source, destination);
			
			//find the resolution
			driver.manage().window().setSize(new Dimension(1920,1080));
		}
		if(name_of_browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			TakesScreenshot s  =(TakesScreenshot) driver; 
		     File source= s.getScreenshotAs(OutputType.FILE); 
			File destination=new File("C:\\TestNG1\\FirefoxScreenshot\\Firefoxscreenshot2");
			FileUtils.copyFile(source, destination);
			//find the resolution
			driver.manage().window().setSize(new Dimension(1366,768));
		}
		
		if(name_of_browser.equals("safari"))
		{   
			driver=new SafariDriver();
			TakesScreenshot s  =(TakesScreenshot) driver; 
		     File source= s.getScreenshotAs(OutputType.FILE); 
			File destination=new File("C:\\TestNG1\\SafariScreenshot\\Safariscreenshot3");
			FileUtils.copyFile(source, destination);
			//find the resolution
			driver.manage().window().setSize(new Dimension(1536,864));
		} 
		driver.navigate().to("https://www.getcalley.com/page-sitemap.xml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement launch1=driver.findElement(By.xpath("//a[@href='https://www.getcalley.com/calley-pro-features/']"));
		launch1.click();
		}


}
