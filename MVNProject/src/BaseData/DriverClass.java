package BaseData;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverClass {

	
	public ChromeDriver driver;
	@BeforeMethod
	public void StartBrowser() {
		
		 System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 System.out.println("before method executed");
	}
	@AfterMethod
	 public void CloseBrowser() {
	
		driver.close(); 	
		System.out.println("After method Executed");
	}
	
	
	
	
	
	
	
	
	
}
