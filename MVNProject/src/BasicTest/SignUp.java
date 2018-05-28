package BasicTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
  @Test
public class SignUp {

	 public void FacebookSignUp() throws InterruptedException {
		
   
		 System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		 driver.findElementByName("firstname").sendKeys("Ankit");
		 driver.findElementByName("pass").sendKeys("12345");
		 driver.findElementByXPath("//input[@aria-label='Mobile number or email address']").sendKeys("123456789");
		 driver.findElementByXPath("//input[@autocomplete='new-password']").sendKeys("123");
		   
		 
		 Select sel1 =new Select(driver.findElementByXPath("//select[@name='birthday_day']"));
		 
		 sel1.selectByIndex(3); 
		 Thread.sleep(4000);
		 
		 Select sel2 = new Select(driver.findElementByXPath("//select[@name='birthday_month']"));
		 sel2.selectByVisibleText("Jan");
		 Thread.sleep(4000);
		 
		 Select sel3 = new Select(driver.findElementByXPath("//select[@name='birthday_year']"));
		 sel3.selectByValue("2005");
		 
		 
		 
		 
		  
		 
	}
}
	 
	 
	
	
	
	
	
	

