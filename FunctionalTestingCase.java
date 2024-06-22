package dealsdray;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FunctionalTestingCase {
	WebDriver driver;
	@Test
	public void functionalcase() throws InterruptedException, IOException
	{
		// Step 1 : Launching the Browser
		driver=new EdgeDriver();
		driver.get("https://demo.dealsdray.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Step 2: Login to the panel
		WebElement username=driver.findElement(By.xpath("//input[@id='mui-1']"));
		username.sendKeys("prexo.mis@dealsdray.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='mui-2']"));
		password.sendKeys("prexo.mis@dealsdray.com");
		WebElement login=driver.findElement(By.xpath("//div[@class='MuiBox-root css-79elbk']"));
		login.click();
		
		//Step 3: Click on order
		
		WebElement order=driver.findElement(By.xpath("//span[@class='sidenavHoverShow css-1s178v5']"));
		order.click();
		
		//Step 4: click on orders inside order
		
		WebElement orders=driver.findElement(By.xpath("(//span[@class='sidenavHoverShow MuiBox-root css-i9zxpg'])[2]"));
		orders.click();
		
		// Step 5 : click on add bulk order
		
		WebElement add_bulk_order=driver.findElement(By.xpath("//button[.='Add Bulk Orders']"));
		add_bulk_order.click();
		
		//Step 6 : upload the file and click on import
		
		WebElement upload=driver.findElement(By.xpath("//input[@class='MuiOutlinedInput-input MuiInputBase-input MuiInputBase-inputSizeSmall css-1imb3v5']"));
		upload.sendKeys("C:\\Users\\Padmini\\Downloads\\demo-data.xlsx");
		WebElement import1=driver.findElement(By.xpath("//button[.='Import']"));
		import1.click();
		
		//Step 7 : Click on validate data
		
		WebElement validate=driver.findElement(By.xpath("//button[.='Validate Data']"));
		validate.click();
		
		//Step 8 : Handle  data validation Javascript popup 
		
		WebElement validate1=driver.findElement(By.xpath("//button[.='Validate Data']"));
		validate1.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		// Step 9 : Take the Screenshot
		
		TakesScreenshot s  =(TakesScreenshot) driver; 
	     File source= s.getScreenshotAs(OutputType.FILE); 
		File destination=new File("C:\\TestNG1\\TakeScreen\\homepage.png");
		FileUtils.copyFile(source, destination);
		
		
		
		
		
		
		
		
	}

}
