package org.RBS.Base;



import java.util.ResourceBundle;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseData {

	public ChromeDriver driver;
	@BeforeMethod
	public void openbrowsr() {
		
		 ResourceBundle rb = ResourceBundle.getBundle("Config"); //**for reading the data from Properties fine.  
		
		 System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get(rb.getString("Application_URl"));
		    System.out.println("Beforemethod had executed");
		
	}
	@AfterMethod
	public void closebrowser() {
		// TODO Auto-generated method stub

		driver.quit();
        System.out.println("After method has excuted");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
