package seleniumIntroduction;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeHRM {
	
WebDriver driver;
	
	@BeforeMethod
	
	public void setUp() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

}
	@Test
	public void OpenOrangeHRM() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String title = driver.getTitle();
		System.out.println("Title of the webPage - "+title);
		
		Assert.assertEquals(title, "OrangeHRM");
		
}
	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
			
		}
	}
	
}
