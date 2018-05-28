package MouseHover;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class A {
	
     public WebDriver driver;
     @BeforeMethod
	public void StartBowser() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.get("http://www.thetestingworld.com/");
		
		
	}
	@AfterMethod
	public void CloseBrowser() {
		//driver.close();

	}
	
	
	
	
}
