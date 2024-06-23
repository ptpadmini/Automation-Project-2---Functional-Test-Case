package dealsdray;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class UITesting {
	WebDriver driver;
	@Test
	public void Launchingwebsite()
	{
		driver=new EdgeDriver();
		driver.navigate().to("https://www.getcalley.com/page-sitemap.xml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
