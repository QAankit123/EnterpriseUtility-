package POMImplementation1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	ChromeDriver driver;
	public LoginPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void EnterUserName(String uname) {
		// TODO Auto-generated method stub
		driver.findElementById("email").sendKeys(uname);
	}
	
	public void EnterPassWord(String pass) {
		// TODO Auto-generated method stub
	 
		driver.findElementById("pass").sendKeys(pass);
}

    public void ClickOnSignInButton() {
	// TODO Auto-generated method stub
    	driver.findElementByXPath("//input[@type='submit']").click();
}

	
	
	
}
	



