package TectCases1;

import org.testng.annotations.Test;

import BaseData.DriverClass;
import POMImplementation1.LoginPage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class FirstTestCase  extends DriverClass {

@Test
	 public void Scenario()
	 {
	LoginPage login = new LoginPage(driver);
	
	login.EnterUserName("8827006735");
	login.EnterPassWord("ankit1991");
	login.ClickOnSignInButton();
		
		
		
	 }
	
	
	
	
}
