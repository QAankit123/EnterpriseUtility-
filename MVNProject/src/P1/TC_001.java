package P1;

import java.io.File;

//import javax.swing.plaf.FileChooserUI;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import P2.BaseData;
import P3.LoginPage;


public class TC_001 extends BaseData {
	@Test
	public void TestCase1() {
		
	LoginPage login = new LoginPage(driver);
	login.EnterUserName("8827006735");
	login.EnterPassWord("ankit1991");
	login.ClickOnSignIn();
	
	//File f1= driver.getScreenshotAs(OutputType.FILE);
	//File f2 = new File("E:\\Ss\\Snp\\sp.png");
	
	File f2 = new File("./ss.png");
	f2= driver.getScreenshotAs(OutputType.FILE);
	System.out.println("Done");
	}
	 
	
	}
	
	
	
	

