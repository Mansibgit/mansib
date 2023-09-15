package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BaseTest {
	 WebDriver driver;        
		@Test
		public void launchApplication() {
			//1 Open the browser
			driver = new ChromeDriver();
			
			//2. Maximize to https://www.amazon.in/
			driver.manage().window().maximize();
			
			//Navigate to 
			driver.get("https://demowebshop.tricentis.com/");
			
		}
		
		
	     
		//11. Close the browser
	//@AfterTest
	//public void closeBrowser() {
	//	driver.quit();
	}
//}
