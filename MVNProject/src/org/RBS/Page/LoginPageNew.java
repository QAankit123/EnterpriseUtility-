package org.RBS.Page;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageNew {
     ChromeDriver driver;
	 public LoginPageNew (ChromeDriver driver)
	 {
		 this.driver=driver;
	 }
	
	public void EnterUserName(String uname) {
		// TODO Auto-generated method stub

		driver.findElementById("email").sendKeys(uname);
		
	}
	
	public void EnterUserPassword(String pass) {
		// TODO Auto-generated method stub

		driver.findElementById("pass").sendKeys(pass);
		
	}
	
	
	public void ClickOnLogin() {
		// TODO Auto-generated method stub

		driver.findElementByXPath("//input[@type='submit']").submit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
