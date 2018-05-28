package oopsImplementaionInWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseData.DriverClass;

public class Tc_1 extends DriverClass {
	
	
	 @Test
	 public void Scenarios()
	 {
	
		 driver.findElementById("email").sendKeys("8827006735");
			driver.findElementById("pass").sendKeys("ankit1991");
			driver.findElementByXPath("//input[@type='submit']").click();
		
	 }
	
	}
