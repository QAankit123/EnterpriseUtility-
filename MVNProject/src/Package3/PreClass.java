package Package3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.ResourceBundle;


public class PreClass {
     public ChromeDriver driver;
     @BeforeMethod
	public void BrowserStart() {
    	
		ResourceBundle rb = ResourceBundle.getBundle("Config");
		 System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver ();
		 driver.get(rb.getString("Application_URl"));
		 System.out.println("before method executed");
		 
	}
	@AfterMethod
	public void BrowserClose(){
		driver.close();
		System.out.println("After method executed");
	}
	
	
}
