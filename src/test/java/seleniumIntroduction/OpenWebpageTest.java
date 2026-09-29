package seleniumIntroduction;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenWebpageTest {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setUp() {
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	@Test
	public void OpenGoggle() {
		driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println("Ttitle of the webPage - "+title);
		
		Assert.assertEquals(title, "Google");
			
		
	}
	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
			
		} 
	}
	

}
