package P2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.beust.jcommander.ResourceBundle;

public class BaseData {

	
	 public ChromeDriver driver;
	
	@BeforeMethod
	public void StartBrowser() {
		
	//java.util.ResourceBundle rb =  new ResourceBundle.get
	    System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    System.out.println("Beforemethod had executed");
	}
	@AfterMethod
	 public void CloseBrowser() {
		// TODO Auto-generated method stub
         driver.quit();
         System.out.println("After method has excuted");
	}
}
	
	
	
	
	
	
	
	
	
	

