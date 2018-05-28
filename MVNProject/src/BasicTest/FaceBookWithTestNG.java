package BasicTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FaceBookWithTestNG {
	ChromeDriver driver;
	@BeforeMethod
	public void TC_1() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("TC1");
	}
	@Test
	public void TC_2(){
		
		driver.findElementById("email").sendKeys("8827006735");
		driver.findElementById("pass").sendKeys("ankit1991");
		driver.findElementByXPath("//input[@type='submit']").click();
		System.out.println("TC2");
	}
	
	@AfterClass
	public void TC_3() {
		// TODO Auto-generated method stub
        driver.close();
        System.out.println("TC3");
	}
}
